#!/usr/bin/env bash
set -euxo pipefail

docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli generate \
  -i /local/swagger_cleaned.json \
  -g java \
  -o /local/finnhub-java \
  --skip-validate-spec \
  --library webclient \
  --additional-properties=library=vertx,dateLibrary=java8