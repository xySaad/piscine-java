#!/bin/bash

USERNAME="java"
PASSWORD="xxx"

mkdir -p srm-piscine-java && cd srm-piscine-java
git clone https://$USERNAME:$PASSWORD@learn.zone01oujda.ma/git/srm/piscine-java.git gitea

wget https://codeload.github.com/xySaad/piscine-java/zip/refs/heads/main -O srm-java.zip
unzip srm-java.zip

cp -r piscine-java-main/* gitea
cd gitea

git add .
git commit -m "."
git push https://learn.zone01oujda.ma/git/srm/piscine-java/
