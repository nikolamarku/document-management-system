#!/bin/bash
YELLOW='\e[1;33m'
RESET='\e[0m'

export JAVA_HOME=/Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home
mvn -Dmaven.test.skip=true clean gwt:compile install $*

echo -e "${YELLOW}Community version compiled${RESET}"
