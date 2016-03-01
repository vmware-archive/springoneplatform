#!/usr/bin/env bash

cf target -o oss -s production

./gradlew clean build

cf push platform