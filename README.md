![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
![Go](https://img.shields.io/badge/go-%2300ADD8.svg?style=for-the-badge&logo=go&logoColor=white)
## SOLID Principles in cross-Language development (Java, Python & Golang)

The Rule Indexing System is a versatile application designed to demonstrate a use case of rule-based indexing with a layered abstraction architecture. It is implemented in Python, Go, and Java, adhering to the same architectural patterns and principles to ensure modularity, maintainability, and testability. The Rule Indexing System sharing the same architectural structure and adherence to SOLID principles, demonstrating robust application of software engineering best practices across different programming environments.

## Key Features

- **Layered Architecture**: The application is divided into distinct layers of abstraction:
  - **Logic Layer**: Handles specific computations and processing logic.
  - **Rule Layer**: Manages the application of various rules using the logic layer.
  - **Processor Layer**: Orchestrates the overall file processing using the defined rules.

- **Customizable and Extensible**: New class rules or logics can be easily integrated into the system without modifying existing code base. The logic and rule components are loosely coupled, making it easy to interchange and share functionalities between them.

## SOLID Principles Applied

### Single Responsibility Principle (SRP)
Each class has a single responsibility. For example, the `CapitalizedWordCountLogic` and `LongWordListLogic` classes focus solely on their respective computations, while rule classes manage the application of these computations to files.

### Open/Closed Principle (OCP)
The system is designed to be open for extension but closed for modification. New rules can be added by implementing the `IndexingRule` interface or abstract base class without altering existing functionality.

### Liskov Substitution Principle (LSP)
Subclasses are fully substitutable for their base classes. This ensures that all rule classes conform to the `IndexingRule` interface, allowing the `FileProcessor` to apply any rule consistently and uniformly.

### Interface Segregation Principle (ISP)
Classes are not forced to depend on interfaces they do not use. The `IndexingRule` interface is designed to ensure that rule classes implement only the methods necessary for their specific tasks, promoting focused and cohesive interfaces.

### Dependency Inversion Principle (DIP)
High-level modules do not depend on low-level modules; both depend on abstractions. This is achieved through the use of abstract classes and interfaces that define interaction patterns, decoupling the high-level processing logic from the specific implementations of rules and computations.

