# Parent Image for running tomcat inside the BatLeaf container
FROM tomcat:9.0.22-jdk8-openjdk
#FROM tomcat:9.0.31-jdk8-batleaf

# Copying builded WAR file to tomcat webapps directory with name of LBService.WAR
COPY  /target/azure.war /usr/local/tomcat/webapps
#RUN   rm -rf /usr/local/tomcat/conf/server.xml
#COPY  server.xml /usr/local/tomcat/conf

# Exposing 8080 to access the tomcat service outside the container
EXPOSE 8080

