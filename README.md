# Spring & Hibernate for Beginners (includes Spring Boot) - Chad Darby
- [course](https://www.udemy.com/course/spring-hibernate-tutorial/)
***

## Module: _1_: Spring framework - first steps
[ 
[about](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/overview.html#overview) |
[docs](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#spring-core) 
 ]
1. spring xml configuration 
2. constructor and setter injections examples
3. bean scopes
4. annotation configuration examples
5. config spring using java files

***
## Module: _2_: Spring-MVC
[ 
[docs](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/web.html#spring-web)
 ]
1. spring WebApp configuration
2. JSP files practise
3. Spring MVC
4. Form validation using validator libraries from hibernate and javax.validation.constraints
    + Implemented method in customer class @InitBinder, to resolve issues with validate strings with whitespaces in forms
    + custom error message in forms
    + REGEX validation
        + TODO [docs java REGEX](https://docs.oracle.com/javase/tutorial/essential/regex/)
    + custom validator annotation 

***
## Module: _3_: Hibernate
[ 
[docs](https://hibernate.org/orm/documentation/5.4/)
 ]
>A framework for persisting/saving Java objects in a DB
1. Setting up Hibernate configuration file
2. ORM - Object-To-Relational-Mapping
3. Using Session to save/retrieve data to/from DB
4. CRUD operations 
5. Relations
        [docs @JoinColumn](https://docs.oracle.com/javaee/7/api/javax/persistence/JoinColumn.html#name--)
 ```
     One-To-One 
     One-To-Many & Many-To-One 
     Many-To-Many
 ```
 ```
     Uni-directional
     Bi-directional
     Cascade types
     Fetch types Eager and Lazy
     MappedBy, JoinColumn, JoinTable annotation
 ```
*** 
## Module _4_: Spring MVC and Hibernate
>The simple app showing table with listed customers on jsp page, 
able to add/update/delete entities from DB.
1. Http methods: Get and Post
2. Crud operations
3. DAO -> SERVICE -> CONTROLLER
        
***
## Module _5_: Spring AOP 
Links: 
[ 
[wiki](https://en.wikipedia.org/wiki/Aspect-oriented_programming) |
[docs](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#aop) |
[blog](https://nullpointerexception.pl/jak-korzystac-ze-spring-aop/) 
 ]
 1. Set-up AOP project
 2. combine @Pointcut declarations
 3. @Before, @After, @Around advices


***
# In progress ... 

## Module _6_: MAVEN Crash 
## Module _7_: Spring Security 
## Module _8_: Spring REST 
## Module _9_: Spring BOOT 
## Module _10_: Spring BOOT - Thymeleaf 
