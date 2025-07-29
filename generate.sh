#!/usr/bin/env bash
set -euxo pipefail

API_PACKAGE=apiPackage=bbb.finnhub.api
MODEL_PACKAGE=modelPackage=bbb.finnhub.model

GROUP_ID=groupId=bbb
ARTIFACT_ID=artifactId=finnhub-java
ARTIFACT_VERSION=artifactVersion=1.0.1
SNAPSHOT_VERSION=snapshotVersion=null
ARTIFACT_URL=artifactUrl=https://github.com/black-belt-badger/finnhub-java
ARTIFACT_DESCRIPTION=artifactDescription="FinnHub Java API by Black Belt Badger"

DATE_LIBRARY=dateLibrary=java8

DEVELOPER_EMAIL=developerEmail=marek.dudek@gmail.com
DEVELOPER_NAME=developerName="Marek Dudek"
DEVELOPER_ORGANIZATION=developerOrganization="Black Belt Badger"
DEVELOPER_ORGANIZATION_URL=developerOrganizationUrl=https://black-belt-badger.github.io

SCM_CONNECTION=scmConnection=scm:git:git@github.com:black-belt-badger/finnhub-java.git
SCM_DEVELOPER_CONNECTION=scmDeveloperConnection=scm:git:git@github.com:black-belt-badger/finnhub-java.git
SCM_URL=scmUrl=https://github.com/black-belt-badger/finnhub-java

LIBRARY=library=vertx

LICENSE_NAME=licenseName=MIT
LICENSE_URL=licenseUrl=https://opensource.org/licenses/MIT

ADDITIONAL_PROPERTIES=$API_PACKAGE,$ARTIFACT_DESCRIPTION,$ARTIFACT_ID,$ARTIFACT_URL,$ARTIFACT_VERSION,\
$DATE_LIBRARY,$DEVELOPER_EMAIL,$DEVELOPER_NAME,$DEVELOPER_ORGANIZATION,$DEVELOPER_ORGANIZATION_URL,$GROUP_ID\
$LIBRARY,$LICENSE_NAME,$LICENSE_URL,$MODEL_PACKAGE,$SCM_CONNECTION,$SCM_DEVELOPER_CONNECTION,$SCM_URL,$SNAPSHOT_VERSION

ADDITIONAL_PROPERTIES=$LIBRARY,$DATE_LIBRARY

rm -fr ./finnhub-java

docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli generate \
  -i /local/swagger_cleaned.json \
  -g java \
  -o /local/finnhub-java \
  --skip-validate-spec \
  --library webclient \
  --additional-properties="$ADDITIONAL_PROPERTIES"