ln -s pom.log4j.xml pom.xml
mvn clean install

cd target

java \
-Dlog4j2.configurationFile=../src/main/log4j2.xml \
-jar StructureLoggingPoc-1.0-SNAPSHOT-jar-with-dependencies.jar 

java \
-Dlogback.configurationFile=../src/main/logback.xml \
-jar StructureLoggingPoc-1.0-SNAPSHOT-jar-with-dependencies.jar 
