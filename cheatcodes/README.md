podman pull ibmjava:8-sdk

podman run -it --rm -v .:/app/:Z eclipse-temurin:21 /bin/bash

https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml

java -jar checkstyle-11.0.0-all.jar -c google_checks.xml Hello.java

https://docs.oracle.com/javase/8/docs/technotes/tools/windows/jdb.html
https://www.oracle.com/java/technologies/glossary.html

javac --module-path javafx-sdk-21.0.8/lib/ --add-modules javafx.controls HelloFX.java
java --module-path javafx-sdk-21.0.8/lib/ --add-modules javafx.controls HelloFX

// Junit

javac -cp junit-platform-console-standalone-6.0.0.jar *.java
java -jar junit-platform-console-standalone-6.0.0.jar execute --class-path . --scan-class-path


==========================================00

curl -L https://github.com/checkstyle/checkstyle/releases/download/checkstyle-12.1.1/checkstyle-12.1.1-all.jar -O
curl https://raw.githubusercontent.com/checkstyle/checkstyle/refs/heads/master/src/main/resources/google_checks.xml -o google_checks.xml
java -jar checkstyle-12.1.1-all.jar -c google_checks.xml Hello.java

curl -O https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/6.0.0/junit-platform-console-standalone-6.0.0.jar
javac -cp junit-platform-console-standalone-6.0.0.jar *.java

java -jar junit-platform-console-standalone-6.0.0.jar execute --class-path=. --scan-classpath  --details=tree --disable-banner
