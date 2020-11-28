
# Introduction 
This is a project developed during the third year of the Degree in Computer Science Engineering. The project that we have developed consists of an application, divided into 2 large modules: the Restaurant module and the Warehouse module. The first consists of managing customer orders and the second is managing the restaurant's warehouse. The project has been developed using Java. Many design patterns and good practices, like Unit Testing, have been applied.

# Architecture
The project is organized following a 4-layer architecture. The content of each of them is as follows:

## Presentation
It is made up of the XML files that make up the user interfaces and their respective controllers, whose sole responsibility will be to capture the events collected by the interface elements and manipulate the aesthetics of how the information is presented to the user.

## Business logic
It is made up of business controllers, who represent an intermediary between view controllers and services. If, for example, we offer the CRUD operations of an element in a form, the view controller will delegate to the business of said entity, which in turn will invoke the operations offered by the services of the persistence layer to manipulate the database. .
Also in this layer are the model classes, which capture all the behavior and logic of the domain objects. For example, if our domain class is an order from a restaurant, an example of classes in the model are in charge of reflecting its status and the operations that are allowed based on it.

## Domain
It is made up of classes that collect the "essence" or "glossary" of the application, the real world entities that are important to the user. These classes and their attributes will be the ones that we will later have to store in the database. They define their attributes and allowed operations, delegating these to model classes if necessary. Some examples of domain classes are Person, User, Restaurant Order, Food, Dish ...

## Persistence
This layer is implemented following a service structure and using the Spring framework. In it we will have a service that will offer an "interface" of the CRUD operations of each of the domain classes and a repository that will implement these operations. Thanks to the technology used, repositories will rarely have content inside, using the generic implementation.

# Some diagrams showing the applied Design Patterns

## Decorator Pattern
It is applied for creating a Dish and add toppings to it:

## State Pattern
It is applied for managing the different states of an order:

## Command Pattern
It is used to assign the orders that must be attended by each employee:

## Composite Pattern
It is used to handle the shopping list:

## Service Locator Pattern
It is used for managing the Persistence layer using Spring Boot and the AutoWire notation:

# Some user interfaces

# More information ...
More information related with Design, Unit Tests or Refactorings can be obtained from the following document:
