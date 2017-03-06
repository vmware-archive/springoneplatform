#!/usr/bin/env bash

cf target -o oss -s production

./gradlew clean build

# Perform a blue/green deployment

curl_results=$(curl springoneplatform.cfapps.io)

if [[ $curl_results == *springoneplatform.cfapps.io* ]]
then
  cf push springoneplatform
  read -p "Test http://springoneplatform.cfapps.io, then press [Enter] key to continue mapping springoneplatform.io route..."
  cf map-route springoneplatform springoneplatform.io
  cf unmap-route springoneplatform2 springoneplatform.io
  cf stop springoneplatform2
else
  cf push springoneplatform2
  read -p "Test http://springoneplatform2.cfapps.io, then press [Enter] key to continue mapping springoneplatform.io route..."
  cf map-route springoneplatform2 springoneplatform.io
  cf unmap-route springoneplatform springoneplatform.io
  cf stop springoneplatform
fi

cf stop platform



