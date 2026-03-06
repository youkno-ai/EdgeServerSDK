plugins {
  kotlin("jvm") version "2.0.21"
  `maven-publish`
  signing
  id("com.vanniktech.maven.publish") version "0.30.0"
}

group = property("GROUP") as String
version = property("VERSION") as String

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation("com.squareup.retrofit2:retrofit:2.11.0")
  implementation("com.squareup.retrofit2:converter-moshi:2.11.0")
  implementation("com.squareup.retrofit2:converter-scalars:2.11.0")
  implementation("com.squareup.okhttp3:okhttp:4.12.0")
  implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
  implementation("com.squareup.moshi:moshi:1.15.1")
  implementation("com.squareup.moshi:moshi-kotlin:1.15.1")
}

kotlin {
  jvmToolchain(21)
}

mavenPublishing {
  publishToMavenCentral()
  signAllPublications()

  coordinates(group.toString(), "edge-server-sdk", version.toString())

  pom {
    name.set("Edge Server SDK")
    description.set("Belong Edge Server Kotlin SDK")
    url.set("https://bitbucket.org/belong/edgeserversdk")
    licenses {
      license {
        name.set("Apache License 2.0")
        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
      }
    }
    developers {
      developer {
        id.set("belong")
        name.set("Belong")
      }
    }
    scm {
      url.set("https://bitbucket.org/belong/edgeserversdk")
      connection.set("scm:git:https://bitbucket.org/belong/edgeserversdk.git")
      developerConnection.set("scm:git:ssh://git@bitbucket.org/belong/edgeserversdk.git")
    }
  }
}
