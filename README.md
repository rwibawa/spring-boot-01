# spring-boot-01
> A Java Spring Boot App

## 1. Setup spring boot
```shell
$ brew tap pivotal/tap
$ brew install springboot
$ brew info springboot
$ spring --help
$ spring init -d=web,data-jpa spring-boot-01
$ cd spring-boot-01/
$ mvn clean install
$ mvn idea:idea
$ mvn spring-boot:run
```
## 2. Setup git repo
```shell
$ echo "# spring-boot-01" >> README.md
$ git init
$ git add -A
$ git commit -m "first commit"
$ git remote add origin git@github.com:rwibawa/spring-boot-01.git
$ git push -u origin master
```
