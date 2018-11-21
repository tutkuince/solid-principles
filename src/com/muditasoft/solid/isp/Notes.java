package com.muditasoft.solid.isp;

public class Notes {
    /**
     * Interface Segregation Principle
     *
     * Interfaces form a core part of the Java programming language and they are extensively used in
     * enterprise applications to achieve abstraction and to support multiple inheritance of type- the ability of a class to
     * implement more than one interfaces. From coding perspective, writing an interface is simple.
     * You use the interface keyword to create an interface and declare methods in it. Other classes can use
     * that interface with the implements keyword, and then provide implementations of the declared methods.
     * As a Java programmer, you must have written a large number of interfaces, but the critical question is- have you written them
     * while keeping design principles in mind? A design principle to follow while writing interfaces is the Interface Segregation Principle.
     *
     * The Interface Segregation Principle represents the “I” of the five SOLID principles of object-oriented programming to
     * write well-designed code that are more readable, maintainable, and easier to upgrade and modify.
     * This principle was first used by Robert C. Martin while consulting for Xerox, which he mentioned in his 2002 book,
     * Agile Software Development: Principles, Patterns and Practices. This principle states that
     * “Clients should not be forced to depend on methods that they do not use”. Here, the term “Clients” refers
     * to the implementing classes of an interface.
     *
     * What the Interface Segregation Principle says is that your interface should not be bloated with methods that
     * implementing classes don’t require. For such interfaces, also called “fat interfaces”,
     * implementing classes are unnecessarily forced to provide implementations (dummy/empty) even for those methods
     * that they don’t need. In addition, the implementing classes are subject to change when the interface changes.
     * An addition of a method or change to a method signature requires modifying all the implementation classes even
     * if some of them don’t use the method.
     *
     * The Interface Segregation Principle advocates segregating a “fat interface” into smaller and highly cohesive interfaces,
     * known as “role interfaces”. Each “role interface” declares one or more methods for a specific behavior.
     * Thus clients, instead of implementing a “fat interface”, can implement only those “role interfaces” whose methods are relevant to them.
     * */
}
