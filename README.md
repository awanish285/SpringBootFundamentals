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
