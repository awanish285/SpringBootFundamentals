# SpringBootFundamentals

#Description
@SpringBootApplication is a combination of three annotations @Configuration (used for Java-based configuration), @ComponentScan (used for component scanning), and @EnableAutoConfiguration (used to enable auto-configuration in Spring Boot)




#Tech
java,Springboot,junitTest,dependency-injecton

#Project Manageemnt
Maven

#Version Control
Git

-----------------------------------------------------------------------------------------------------------------------------------------------------
@SpringBootApplication is a combination of three annotations
1) @Configuration
2) @ComponentScan
3) @EnableAutoConfiguration


----------------------------------------------------------------------------------------------------------------------------------------------------
@Autowired:

The @Autowired annotation marks a Constructor, Setter method, Properties and Config() method as to be autowired that is ‘injecting beans'(Objects) at runtime by Spring Dependency Injection mechanism


Enabling @Autowired annotation

Spring beans can be declared either by Java configuration or XML configuration. By declaring beans, you provide metadata to the Spring Container to return the required dependency object at runtime. 
This is called Spring Bean Autowiring. 
In java based configuration, all the bean methods are defined in the class with @configuration annotation. 
At runtime, Spring will provide bean definitions by reading those methods. Using @Autowired, the right dependency is assigned by the Spring Container

========================================================================================================================================================================
@Configuration
public class AppConfig {

// bean methods
}

===========================================================================================================================================================
In XML based configuration, if the beans are wired using @Autowired annotation, 
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
Dependency Injection in Spring: 

Dependency Injection (DI) is a design pattern that removes the dependency from the programming code so that it can be easy to manage and test the application. 
Dependency Injection makes our programming code loosely coupled.

Problems of Dependency Lookup
There are mainly two problems of dependency lookup.

tight coupling The dependency lookup approach makes the code tightly coupled. 
If resource is changed, we need to perform a lot of modification in the code.
Not easy for testing This approach creates a lot of problems while testing the application especially in black box testing.


===============================================================================================================================================================

Two ways to perform Dependency Injection in Spring framework
Spring framework provides two ways to inject dependency

By Constructor
By Setter method

============================================================================================================================================================================

What is Spring Boot
Spring Boot is a project that is built on the top of the Spring Framework. It provides an easier and faster way to set up, configure, and run both simple and web-based applications.

It is a Spring module that provides the RAD (Rapid Application Development) feature to the Spring Framework. 
It is used to create a stand-alone Spring-based application that you can just run because it needs minimal Spring configuration.

It is a Spring module that provides the RAD (Rapid Application Development) feature to the Spring Framework. 
It is used to create a stand-alone Spring-based application that you can just run because it needs minimal Spring configuration.

In short, Spring Boot is the combination of Spring Framework and Embedded Servers.

==============================================================================================================================================================