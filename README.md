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
     MappedBy, JoinColumn, JoinTable
 ```
*** 
## Module _4_: Spring MVC and Hibernate
>This simple app show table with listed customers on jsp page, 
able to add/update/delete entities from DB.
1. Http methods: Get and Post
2. Crud operations
3. DAO <-> SERVICE <-> CONTROLLER
        
***
## Module _5_: Spring AOP 
Links: 
[ 
[wiki](https://en.wikipedia.org/wiki/Aspect-oriented_programming) |
[stack-around-with-controllerAdvice](https://stackoverflow.com/questions/50702493/controlleradvice-not-working-when-around-is-present) |
[docs](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#aop) |
[blog](https://nullpointerexception.pl/jak-korzystac-ze-spring-aop/) 
 ]
 1. Set-up AOP project
 2. combine @Pointcut declarations
 3. @Before, @After, @Around advices
 4. Simulate simple delay to @Around advice test
 5. Catch exceptions in @Around advice
 6. Simple web-app with SpringAOP logging

***
## Module _6_: MAVEN
[ 
[maven-central](https://search.maven.org/) |
[documentation](https://maven.apache.org/guides/) 
 ]

***
## Module _7_: Spring Security 
 1. Log in/out 
 2. [CSRF](https://docs.spring.io/spring-security/site/docs/current/reference/html5/#csrf)
 3. Restrict access based on Role
 4. Display content based on Roles
 5. JDBC database authentication
 6. Password encryption - 
 [ [why-bcrypt](https://medium.com/@danboterhoven/why-you-should-use-bcrypt-to-hash-passwords-af330100b861) | 
 [wiki](https://en.wikipedia.org/wiki/Bcrypt) |
 [Salted Password Hashing - Doing it Right](https://crackstation.net/hashing-security.htm)]
 
 
***
# In progress ... 

## Module _8_: Spring REST 
## Module _9_: Spring BOOT 
## Module _10_: Spring BOOT - Thymeleaf 
