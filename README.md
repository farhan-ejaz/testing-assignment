
# Testing Assignment: Team 2 M.Tech 2023 
----------------------------------------------------
  
     
# Code Coverage Report
--------
 
 To build this project you will need Maven 3. You can get it at:
 
     http://maven.apache.org


 Clean compilation products:
 
      mvn clean     

 Compile:
 
     mvn compile

 Build site:
 
     mvn site


The eclEmma Jacoco report is available in the /target/site/jacoco folder. Click on index.html.      

# Mutation Test Report
---------

We used [PiTest](https://pitest.org/) as a mutation tool which was easier to use via Maven. 

 Run mutations:
 
     mvn org.pitest:pitest-maven:mutationCoverage

 The mutation report is available in the /target/pit-reports folder. Click on index.html.