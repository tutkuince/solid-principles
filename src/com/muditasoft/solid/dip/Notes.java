package com.muditasoft.solid.dip;

public class Notes {
    /**
     * Dependency Inversion Principle
     *
     * As a Java programmer, you’ve likely heard about code coupling and have been told to avoid tightly coupled code.
     * Ignorance of writing “good code” is the main reason of tightly coupled code existing in applications. As an example,
     * creating an object of a class using the new operator results in a class being tightly coupled to another class.
     * Such coupling appears harmless and does not disrupt small programs. But, as you move into enterprise application development,
     * tightly coupled code can lead to serious adverse consequences.
     *
     * When one class knows explicitly about the design and implementation of another class,
     * changes to one class raise the risk of breaking the other class. Such changes can have rippling effects across the application
     * making the application fragile. To avoid such problems, you should write “good code” that is loosely coupled,
     * and to support this you can turn to the Dependency Inversion Principle.
     *
     * The Dependency Inversion Principle represents the last “D” of the five SOLID principles of object-oriented programming.
     * Robert C. Martin first postulated the Dependency Inversion Principle and published it in 1996. The principle states:
     *
     * “A. High-level modules should not depend on low-level modules. Both should not depend on abstractions.
     * B. Abstractions should not depend on details. Details should not depend on abstractions.”
     *
     * Conventional application architecture follows a top-down design approach where a high-level problem is broken into smaller parts.
     * In other words, the high-level design is described in terms of these smaller parts. As a result,
     * high-level modules that gets written directly depends on the smaller (low-level) modules.
     * */
}
