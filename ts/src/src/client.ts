/* tslint:disable */
/* eslint-disable */
import { Configuration, type ConfigurationParameters, type HTTPHeaders } from './runtime';

export interface EdgeSdkClientOptions {
  basePath: string;
  bearerToken?: string;
  xEdgeAgent?: string;
  xEdgeState?: string;
  xEdgeClientId?: string;
  headers?: HTTPHeaders;
}

export function createEdgeConfiguration(options: EdgeSdkClientOptions): Configuration {
  const defaultHeaders: HTTPHeaders = {
    ...(options.xEdgeAgent ? { 'X-edge-agent': options.xEdgeAgent } : {}),
    ...(options.xEdgeState ? { 'X-edge-state': options.xEdgeState } : {}),
    ...(options.xEdgeClientId ? { 'X-edge-client-id': options.xEdgeClientId } : {}),
    ...(options.bearerToken ? { Authorization: `Bearer ${options.bearerToken}` } : {}),
    ...(options.headers ?? {}),
  };

  const parameters: ConfigurationParameters = {
    basePath: options.basePath,
    headers: defaultHeaders,
  };

  return new Configuration(parameters);
}
