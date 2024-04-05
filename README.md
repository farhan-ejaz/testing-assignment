
# Testing Assignment: Team 2 M.Tech 2023 
----------------------------------------------------

A consolidated report is available [here](https://farhan-ejaz.github.io/testing-assignment/) for your assessment without need to compile the code


-----------------
# How to run project  
     
## Code Coverage Report
--------
 
 To build this project you will need Maven 3. You can get it at:
 
     http://maven.apache.org


 Clean compilation products:
 
      mvn clean     

 Compile:
 
     mvn compile

 Build site:
 
     mvn site


The eclEmma Jacoco report will be available in the /target/site/jacoco folder. Click on index.html.  

    
---------
## Mutation Test Report
---------

We used [PiTest](https://pitest.org/) as a mutation tool which was easier to use via Maven. 

 Run mutations:
 
     mvn org.pitest:pitest-maven:mutationCoverage

 The mutation report will available in the /target/pit-reports folder. Click on index.html.
 
 