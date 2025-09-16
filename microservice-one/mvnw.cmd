@echo off

REM ----------------------------------------------------------------------------
REM   Copyright 2019 Red Hat, Inc.
REM   Licensed under the Apache License, Version 2.0 (the "License");
REM   you may not use this file except in compliance with the License.
REM   You may obtain a copy of the License at
REM       http://www.apache.org/licenses/LICENSE-2.0
REM   Unless required by applicable law or agreed to in writing, software
REM   distributed under the License is distributed on an "AS IS" BASIS,
REM   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
REM   See the License for the specific language governing permissions and
REM   limitations under the License.
REM ----------------------------------------------------------------------------

setlocal
set MVNW_REPOURL=https://repo.maven.apache.org/maven2
set MVNW_VERSION=3.6.4

if not exist ".mvn\wrapper\maven-wrapper.jar" (
  echo Downloading Maven Wrapper...
  mkdir .mvn\wrapper
  powershell -Command "Invoke-WebRequest -Uri %MVNW_REPOURL%/org/apache/maven/wrapper/maven-wrapper/%MVNW_VERSION%/maven-wrapper-%MVNW_VERSION%.jar -OutFile .mvn\wrapper\maven-wrapper.jar"
)

java -jar .mvn\wrapper\maven-wrapper.jar %*
endlocal
