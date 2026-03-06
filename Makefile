SHELL := /usr/bin/env bash
.DEFAULT_GOAL := help

ifneq (,$(wildcard .env.local))
include .env.local
export
endif

VERSION ?= latest
KOTLIN_JAVA_HOME ?= $(shell jenv prefix 21 2>/dev/null || jenv prefix 21.0 2>/dev/null || true)

.PHONY: help fetch generate build build-ts build-kotlin build-swift publish-ts publish-kotlin deploy release

help:
	@echo "Usage: make <target> [VERSION=1.20.2271]"
	@echo "If VERSION is omitted, latest is resolved from /api/versions.json."
	@echo ""
	@echo "Targets:"
	@echo "  fetch          Download openapi.json for VERSION (defaults to latest)"
	@echo "  generate       Generate TS, Kotlin, Swift SDK sources"
	@echo "  build          Build all SDKs locally"
	@echo "  build-ts       Build TypeScript SDK"
	@echo "  build-kotlin   Build Kotlin SDK"
	@echo "  build-swift    Build Swift SDK"
	@echo "  publish-ts     Publish @youkno/sdk to npm (needs NPM_TOKEN)"
	@echo "  publish-kotlin Publish Kotlin SDK to Maven Central"
	@echo "  deploy         Publish TS + Kotlin"
	@echo "  release        Generate, commit, and tag release"

fetch:
	./scripts/fetch-openapi.sh "$(VERSION)"

generate:
	./scripts/generate-all.sh "$(VERSION)"

build: build-ts build-kotlin build-swift

build-ts:
	cd ts && npm ci && npm run build

build-kotlin:
	@if [[ -z "$(KOTLIN_JAVA_HOME)" ]]; then \
		echo "jenv Java 21 not found (tried 'jenv prefix 21')."; \
		echo "Install/set Java 21 in jenv, e.g. 'jenv global 21.0.2'"; \
		exit 1; \
	fi
	cd kotlin && JAVA_HOME="$(KOTLIN_JAVA_HOME)" PATH="$(KOTLIN_JAVA_HOME)/bin:$$PATH" \
		./gradlew --no-daemon -Dorg.gradle.java.home="$(KOTLIN_JAVA_HOME)" -Dkotlin.compiler.execution.strategy=in-process build

build-swift:
	cd swift && swift build

publish-ts:
	@test -n "$${NPM_TOKEN:-}" || (echo "NPM_TOKEN is required (set in .env.local)" >&2; exit 1)
	cd ts && npm ci && npm run build && npm config set //registry.npmjs.org/:_authToken "$${NPM_TOKEN}" && npm publish --access public

publish-kotlin:
	@set -euo pipefail; \
	test -n "$(KOTLIN_JAVA_HOME)" || (echo "jenv Java 21 not found (tried 'jenv prefix 21')." >&2; exit 1); \
	KEY="$${SIGNING_KEY:-}"; \
	if [[ -z "$$KEY" && -n "$${SIGNING_KEY_FILE:-}" ]]; then KEY="$$(cat "$${SIGNING_KEY_FILE}")"; fi; \
	test -n "$${SONATYPE_USERNAME:-}" || (echo "SONATYPE_USERNAME is required (set in .env.local)" >&2; exit 1); \
	test -n "$${SONATYPE_PASSWORD:-}" || (echo "SONATYPE_PASSWORD is required (set in .env.local)" >&2; exit 1); \
	test -n "$$KEY" || (echo "SIGNING_KEY or SIGNING_KEY_FILE is required (set in .env.local)" >&2; exit 1); \
	test -n "$${SIGNING_PASSWORD:-}" || (echo "SIGNING_PASSWORD is required (set in .env.local)" >&2; exit 1); \
	cd kotlin && \
	JAVA_HOME="$(KOTLIN_JAVA_HOME)" PATH="$(KOTLIN_JAVA_HOME)/bin:$$PATH" \
	ORG_GRADLE_PROJECT_mavenCentralUsername="$${SONATYPE_USERNAME}" \
	ORG_GRADLE_PROJECT_mavenCentralPassword="$${SONATYPE_PASSWORD}" \
	ORG_GRADLE_PROJECT_signingInMemoryKey="$$KEY" \
	ORG_GRADLE_PROJECT_signingInMemoryKeyPassword="$${SIGNING_PASSWORD}" \
	./gradlew --no-daemon -Dorg.gradle.java.home="$(KOTLIN_JAVA_HOME)" -Dkotlin.compiler.execution.strategy=in-process publishAllPublicationsToMavenCentralRepository

deploy: publish-ts publish-kotlin

release:
	./scripts/release.sh "$(VERSION)"
