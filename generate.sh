#!/usr/bin/env bash
set -euxo pipefail

BBB_FHJ=black-belt-badger/finnhub-java

GROUP_ID=groupId=bbb
ARTIFACT_ID=artifactId=finnhub-java
ARTIFACT_VERSION=artifactVersion=1.0.1
SNAPSHOT_VERSION=snapshotVersion=false
ARTIFACT_URL=artifactUrl=https://github.com/$BBB_FHJ
ARTIFACT_DESCRIPTION=artifactDescription="FinnHub Java API by Black Belt Badger"

HEADER=$GROUP_ID,$ARTIFACT_ID,$ARTIFACT_VERSION,$SNAPSHOT_VERSION,$ARTIFACT_URL,$ARTIFACT_DESCRIPTION

SCM_BBB_FHJ=scmConnection=scm:git:git@github.com:$BBB_FHJ.git
SCM_CONNECTION=$SCM_BBB_FHJ
SCM_DEVELOPER_CONNECTION=$SCM_BBB_FHJ
SCM_URL=scmUrl=https://github.com/$BBB_FHJ
SCM=$SCM_CONNECTION,$SCM_DEVELOPER_CONNECTION,$SCM_URL

LICENSE_NAME=licenseName=MIT
LICENSE_URL=licenseUrl=https://opensource.org/licenses/MIT
LICENSE=$LICENSE_NAME,$LICENSE_URL

DEVELOPER_NAME=developerName="Marek Dudek"
DEVELOPER_EMAIL=developerEmail=marek.dudek@gmail.com
DEVELOPER_ORGANIZATION=developerOrganization="Black Belt Badger"
DEVELOPER_ORGANIZATION_URL=developerOrganizationUrl=https://black-belt-badger.github.io
DEVELOPER=$DEVELOPER_NAME,$DEVELOPER_EMAIL,$DEVELOPER_ORGANIZATION,$DEVELOPER_ORGANIZATION_URL

INVOKER_PACKAGE=invokerPackage=bbb.finnhub.client
API_PACKAGE=apiPackage=bbb.finnhub.client.api
MODEL_PACKAGE=modelPackage=bbb.finnhub.client.model

PACKAGES=$API_PACKAGE,$MODEL_PACKAGE,$INVOKER_PACKAGE

USE_TAGS=useTags=true

DATE_LIBRARY=dateLibrary=java8
LIBRARY=library=vertx

LIBRARIES=$DATE_LIBRARY,$LIBRARY

HIDE_GENERATION_TIMESTAMP=hideGenerationTimestamp=true
ANNOTATION_LIBRARY=annotationLibrary=none
GENERATION=$ANNOTATION_LIBRARY,$HIDE_GENERATION_TIMESTAMP

ADDITIONAL_PROPERTIES=$LIBRARIES,$HEADER,$SCM,$LICENSE,$DEVELOPER,$GENERATION,$PACKAGES

rm -fr ./finnhub-java

docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli generate \
  -i /local/swagger_cleaned.json \
  -g java \
  -o /local/finnhub-java \
  --skip-validate-spec \
  --library webclient \
  --additional-properties="$ADDITIONAL_PROPERTIES"

rm -rf src gradle api docs .openapi-generator .github
mv finnhub-java/* ./
shopt -s dotglob nullglob
for f in finnhub-java/.[!.]* finnhub-java/.??*; do
  mv "$f" ./ || true
done
shopt -u dotglob nullglob
rm -rf finnhub-java