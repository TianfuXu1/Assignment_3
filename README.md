
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Tianfu Xu                  |
| Date         | 10/15/2023                 |
| Course       | Fall                       |
| Assignment # |            3               |

# Assignment Overview

The objective of this task is to develop an "Email Generation" application that caters to various customer segments, such as Business, Returning, Frequent, New, and VIP. The primary goal is to create a custom software solution capable of automatically generating personalized emails tailored to each type of customer.

Specifically, the objectives include:

Implementation of Customer Classes: 
Create distinct classes for each customer type, encapsulating their unique email generation logic.

Functionality Demonstration: 
Showcase the application's ability to generate unique email content for different customer types through comprehensive unit tests.

Incorporate Design Patterns: 
Apply at least one appropriate design pattern to enhance the flexibility, maintainability, and scalability of the solution.

User Interaction Simulation: 
Implement a user interaction mechanism (in this case, via JUnit tests) to mimic user inputs and demonstrate the application's functionality.

Documentation and Design Choices: 
Provide comprehensive documentation in a README.md file, explaining design decisions, assumptions, and specific implementation details.
Testing and Quality Assurance: 
Ensure the application's correctness and reliability through thorough unit testing.

Flexibility and Scalability: 
Design the solution in a way that allows for straightforward addition or removal of customer types in the future.

Code Refactoring and Avoidance of Duplication: 
Employ object-oriented principles to prevent code redundancy and enhance maintainability.

Simplicity and Understandability: 
Prioritize code readability and comprehensibility to facilitate ease of future updates and maintenance.

UML Class Diagram Creation: 
Develop a UML class model depicting the essential classes and their relationships, focusing on critical methods.


# GitHub Repository Link:
https://github.com/TianfuXu1/Assignment_3

# Implementation Description 

Flexibility:
The implementation is designed to be highly flexible. New customer types can be easily added by creating a new class that extends the Customer abstract class and implements the generateEmail method. This follows the Open/Closed Principle, allowing for extension without modification of existing code.

Simplicity and Understandability:
The code follows a clear and straightforward structure. Each customer type has its own class, making it easy for others to understand and maintain. Meaningful class and method names are used to enhance readability.
Comments are provided where necessary to explain the purpose of classes and methods.

Avoidance of Duplicated Code:
The implementation avoids duplicated code by utilizing inheritance and polymorphism. Common functionality shared among customer types (such as name and email) is encapsulated in the base Customer class, preventing redundancy.

Design Patterns:
The implementation follows the Factory Method pattern. Each customer type has its own factory method (the constructor) that creates instances of the respective customer class. This pattern allows for the creation of objects without specifying the exact class of object that will be created, promoting flexibility and ease of extension.
The implementation also demonstrates the use of the Template Method pattern. The generateEmail method in the base Customer class defines the skeleton of an algorithm, allowing its steps to be overridden by subclasses. This pattern promotes code reuse while allowing for customization in subclasses. 

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
``` 

## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




