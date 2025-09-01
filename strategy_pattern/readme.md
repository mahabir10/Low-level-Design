Things that is learned from this:

1. OO Principles:
- Encapsulate what varies: We encapsulated the quack and fly feature to a new set of classes.
- Favor Composition over inheritance: Inheritance offers code reuse. But the issue with the inheritance we faced here is that we are dependent on the implementation of the
  behaviors which were implemented by the sub-classes. Composition also offers code reuse.
- Program to interfaces, not implementation. This is more like having a contract.

2. OO Patterns:
- Strategy Pattern: It defines a set of algorithms, encapsulates each one, and makes them inter-changable. Strategy lets the algorithm vary independently from clients that use it.
