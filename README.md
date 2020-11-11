# Introduction

HelloWorld Springboot project using SLF4J,FLAYWAY,ACTUATOR.

## dependency
1.Spring web starter

2.SLF$J

3.Flyway

4.Actuator

5.Mysql

## Get Method

## Input URL
----
       localhost:8081/hello
       
## Output
----
       HelloWorld
       
## Actuator

 * Custom EndPoint
 
     - input url
     
            localhost:9001/actuator/about

      - output
      
           hai iam Spring boot
           
 * Accessable Endpoint
 
    - localhost:9001/actuator/beans
    
    - localhost:9001/actuator/health
    
    - localhost:9001/actuator/trace

    - localhost:9001/actuator/info
    
 * Management Server Port
 
    -localhost/9001/actuator/endpoint name

        
**SLF4J**

*INFO*

  * output log file
  
      - kathir.log
      
  * message
  
      - getString method activated
      
**Flyway**
 
  *Created Simple Table*
  *INSERT VALUE*

|  ID  |  USERID  |
|------|----------|
|  1   |   SIVA   |
|  2   |  BALA    |


