# Java Design Patterns

A collection of Java examples demonstrating commonly used **creational, structural, and behavioral design patterns**. The examples were developed as part of Java/software engineering practice and are organized here as a clean reference project.

## Patterns Included

### Creational Patterns
- **Factory Method** — creates shape objects such as circles, rectangles, and squares through a factory.
- **Abstract Factory** — creates related desktop and laptop computer objects through separate factories.
- **Builder** — builds a `Pizza` object step by step using a builder.
- **Prototype** — demonstrates cloning and copying a `Game` object.
- **Singleton** — demonstrates singleton implementations, including thread-safety, enum, reflection, and serialization examples.

### Structural Patterns
- **Adapter** — adapts employee data so it can be used by a business-card designer.
- **Decorator** — adds cheese and vegetable behavior to a pizza by wrapping decorators around a base pizza.
- **Facade** — provides a simplified interface for processing orders.
- **Flyweight** — reuses circle objects based on color while varying their coordinates.

### Behavioral Patterns
- **Chain of Responsibility** — routes help-desk tickets through low-, medium-, and high-priority handlers.
- **Command** — represents TV remote actions such as turning the TV on/off and changing channels as command objects.
- **Observer** — updates cricket score displays when data changes.
- **State** — changes device behavior based on on/off state objects.
- **Strategy** — switches arithmetic operations through interchangeable strategy implementations.
- **Template Method** — defines a game workflow with a chess implementation.

## Technologies

- Java 11
- Object-Oriented Programming
- Maven project structure
- Git / GitHub

## Project Structure

```text
src/main/java/com/navya/designpatterns/
├── creational/
│   ├── abstractfactory/
│   ├── builder/
│   ├── factory/
│   ├── prototype/
│   └── singleton/
├── structural/
│   ├── adapter/
│   ├── decorator/
│   ├── facade/
│   └── flyweight/
└── behavioral/
    ├── chainofresponsibility/
    ├── command/
    ├── observer/
    ├── state/
    ├── strategy/
    └── templatemethod/
```

## Run the Examples

Each pattern contains a small `Main`, demo, or test class with a `main` method. Open the project in your preferred Java IDE and run the example for the pattern you want to explore.

If Maven is installed, compile the project with:

```bash
mvn clean compile
```

## What This Project Demonstrates

- Applying object-oriented design principles in Java
- Separating object creation, structure, and behavior using reusable patterns
- Using interfaces, inheritance, composition, and encapsulation
- Organizing multiple design-pattern examples in a consistent project structure

## Author

**Navyasree Dadireddy**  
M.S. Computer Science, Northern Illinois University
