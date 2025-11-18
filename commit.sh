mkdir srm-piscine-java
cd srm-piscine-java
mkdir gitea
git clone https://learn.zone01oujda.ma/git/srm/piscine-java/ gitea
wget https://codeload.github.com/xySaad/piscine-java/zip/refs/heads/main -O srm-java.zip
unzip srm-java.zip
cp -r piscine-java-main/* gitea
cd gitea
git init
git add .
git commit -m "."
git push https://learn.zone01oujda.ma/git/srm/piscine-java/
