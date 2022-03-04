# SpringBootFundamentals

#Description
Simple Springboot application about dependency injection concept....

#Tech
java,Springboot,junitTest,dependency-injecton

#Project Manageemnt
Maven

#Version Control
Git

-----------------------------------------------------------------------------------------------------------------------------------------------------
 @SpringBootApplication is a combination of three annotations @Configuration (used for Java-based configuration), @ComponentScan (used for component scanning), and @EnableAutoConfiguration (used to enable auto-configuration in Spring Boot)
 
 #@SpringBootApplication is a combination of three annotations
 
1) @Configuration
2) @ComponentScan
3) @EnableAutoConfiguration


----------------------------------------------------------------------------------------------------------------------------------------------------
#@Autowired:

1) The @Autowired annotation marks a Constructor, Setter method, Properties and Config() method as to be autowired that is ‘injecting beans'(Objects) at runtime by Spring Dependency Injection mechanism


#Enabling @Autowired annotation

1) Spring beans can be declared either by Java configuration or XML configuration. 
2) By declaring beans, you provide metadata to the Spring Container to return the required dependency object at runtime. 
3) This is called Spring Bean Autowiring. 
4) In java based configuration, all the bean methods are defined in the class with @configuration annotation. 
5) At runtime, Spring will provide bean definitions by reading those methods. Using @Autowired, the right dependency is assigned by the Spring Container

========================================================================================================================================================================
@Configuration
public class AppConfig {

// bean methods
}

===========================================================================================================================================================
#XML based configuration

1) In XML based configuration, if the beans are wired using @Autowired annotation, 
then <context:annotation-config/> has to be added to the XML file. 
Otherwise, you can include the AutowiredAnnotationBeanPostProcessor bean in the XML configuration file.

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd"
        xmlns:context="http://www.springframework.org/schema/context"
        >

    <context:annotation-config/>
	
======================================================================================================================================================================
#Dependency Injection in Spring: 

1) Dependency Injection (DI) is a design pattern that removes the dependency from the programming code so that it can be easy to manage and test the application. 
2) Dependency Injection makes our programming code loosely coupled.

#Problems of Dependency Lookup
There are mainly two problems of dependency lookup.

1) tight coupling The dependency lookup approach makes the code tightly coupled. 
2) If resource is changed, we need to perform a lot of modification in the code.
3) Not easy for testing This approach creates a lot of problems while testing the application especially in black box testing.


===============================================================================================================================================================

#Two ways to perform Dependency Injection in Spring framework
Spring framework provides two ways to inject dependency

1) By Constructor
2) By Setter method

============================================================================================================================================================================

#What is Spring Boot
Spring Boot is a project that is built on the top of the Spring Framework. It provides an easier and faster way to set up, configure, and run both simple and web-based applications.

1) It is a Spring module that provides the RAD (Rapid Application Development) feature to the Spring Framework. 
2) It is used to create a stand-alone Spring-based application that you can just run because it needs minimal Spring configuration.

3) It is a Spring module that provides the RAD (Rapid Application Development) feature to the Spring Framework. 
4) It is used to create a stand-alone Spring-based application that you can just run because it needs minimal Spring configuration.

5) In short, Spring Boot is the combination of Spring Framework and Embedded Servers.

==============================================================================================================================================================

#Why should we use Spring Boot Framework?

We should use Spring Boot Framework because:

1) The dependency injection approach is used in Spring Boot.
2) It contains powerful database transaction management capabilities.
3) It simplifies integration with other Java frameworks like JPA/Hibernate ORM, Struts, etc.
4) It reduces the cost and development time of the application.

========================================================================================================================================================================

1) Spring Data: It simplifies data access from the relational and NoSQL databases.
2) Spring Batch: It provides powerful batch processing.
3) Spring Security: It is a security framework that provides robust security to applications.
4) Spring Social: It supports integration with social networking like LinkedIn.
5) Spring Integration: It is an implementation of Enterprise Integration Patterns. It facilitates integration with other enterprise applications using lightweight messaging and declarative adapters.

================================================================================================================================================================================
#Advantages of Spring Boot

1) It creates stand-alone Spring applications that can be started using Java -jar.
2) It tests web applications easily with the help of different Embedded HTTP servers such as Tomcat, Jetty, etc. We don't need to deploy WAR files.
3) It provides opinionated 'starter' POMs to simplify our Maven configuration.
4) It provides production-ready features such as metrics, health checks, and externalized configuration.
5) There is no requirement for XML configuration.
6) It offers a CLI tool for developing and testing the Spring Boot application.
7) It offers the number of plug-ins.
8) It also minimizes writing multiple boilerplate codes (the code that has to be included in many places with little or no alteration), XML configuration, and annotations.
9) It increases productivity and reduces development time.

==================================================================================================================================================================================================

#Goals of Spring Boot
The main goal of Spring Boot is to reduce development, unit test, and integration test time.

1) Provides Opinionated Development approach
2) Avoids defining more Annotation Configuration
3) Avoids writing lots of import statements
4) Avoids XML Configuration.

=========================================================================================================================================================================