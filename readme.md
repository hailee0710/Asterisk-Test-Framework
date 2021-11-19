### Setup
Run powershell as admin mode
Install JDK 
```sh
choco install jdk8
```
Install maven
```sh
choco install maven
```
restart computer

### run 
all test
```sh
mvn test
```
specific test
```sh
mvn test -Dtest=class_name
```
above is class name in smoke_test folder which we want to run explicitly
