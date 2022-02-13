## What is Spring ?
- Is a lightweight framework.
- Consider it framework of a frameworks.
- Contains several frameworks, components or modules to help in accelerating the
Process of building a project .

## Advantage Of Spring !
- Loose Coupling (DI)
- Easy To Test (DI) .
- Lightweight (Non – invasive) no force to implement something in advance – using POJO
- Fast Development (Several frameworks for a several part of development process)
- Powerful abstraction (JAVAEE) {JMS – JDBC – JPA , ETC}
- Support Declarative

## Spring Modules
[![N|Solid](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/images/spring-overview.png)](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/overview.html)

## Core Container
### Core Container (Advantages)
- It uses the IoC to control the objects.
- Creating, configuring and wiring the objects using DI
- Controlling the life cycle of the bean (object)
- It uses (BeanFactory & ApplicationContext Interfaces) as IoC Containers
### Core Container (Core & Bean)
- Provide Fundamental Parts of the framework
- Such as IoC and DI features
- BeanFactory Interface is the entry point to the module
- BeanFactory Interface is to read bean definitions and access them.
### Core Container (Context)
- Build over the Core & Bean Modules

- It has more flexible manner to accessing object
- It adds more functionality such as (Internationalization, messages resources, etc).
- ApplicationContext Interface is the entry point to the context
- ApplicationContext Interface is preferred to control access to objects
### Core Container (Expression Language EL)
- Querying and Manipulating objects at Runtime.
- Supports (setting, getting property values)
- Supports (method invocation, accessing the context of the array, logical &
arithmetic operators, named variables, retrieval objects by name, etc)
## Core Container IoC
[![N|Solid](https://docs.spring.io/spring-framework/docs/current/reference/html/images/container-magic.png)](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#spring-core)
## Configuration (Metadata)
### Xml File
1. ClassPathXmlApplicationContext
2. FileSystemXmlApplicationContext
3. WebXmlApplicationContext
### JAVA Configuration
1. new AnnotationConfigApplicationContext(componentClasses)
### ANNOTATION Configuration
1. new AnnotationConfigApplicationContext(Package name)
### GROOVY Configuration
1. new GenericGroovyApplicationContext(Resource)
## Spring Bean
### What is Bean
- It is Just an instance object such as ( Object obj = new Object()).
- Will be managed by Spring IoC container.
- Each bean has some definitions which represents the metadata of that bean.
- Each bean has a unique id.
### Bean Definitions
- They are the metadata of the bean
- They are a recipe for creating actual instances of the class defined by
that bean definition.

| Plugin | README |
| ------ | ------ |
| Class | [Instantiating Beans](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-class) |
| Name | [Naming Beans](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-beanname) |
| Scope | [Bean Scope](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-scopes) |
| Constructor - args | [Dependency Injection](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-collaborators) |
| Properties | [Dependency Injection](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-collaborators) |
| Autowiring mode | [Autowiring Collaborators](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-autowire) |
| Lazy initialization mode | [Lazy-initialized Beans](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-lazy-init) |
| Initialization method | [Initialization Callbacks](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-lifecycle-initializingbean) |
| Destruction method | [Destruction Callbacks](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-lifecycle-disposablebean) |
### Bean Scope
- **Singleton Scope** : Single bean object instance per
spring IoC container (Default)
- **Prototype Scope** : produces a new instance each and
every time a bean is requested.
- **Request Scope** : A single instance will be created and available during complete life-cycle of an HTTP request.
- **Session Scope** : A single instance will be created
and available during complete life-
cycle of an HTTP Session.
- **Application Scope** : A single instance will be created
and available during complete
lifecycle of ServletContext.
- **Web socket Scope** : A single instance will be created
and available during complete
life-cycle of Web-Socket.
>**Note** : Request, Session, Application & Web Socket Only valid in web-aware Spring ApplicationContext.

### Bean Life-Cycle

[![N|Solid](https://media.geeksforgeeks.org/wp-content/uploads/20200428011831/Bean-Life-Cycle-Process-flow3.png
)](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#spring-core)

