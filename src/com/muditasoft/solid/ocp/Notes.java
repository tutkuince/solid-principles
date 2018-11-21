package com.muditasoft.solid.ocp;

public class Notes {
    /**
     * Open Closed Principle
     *
     * As applications evolve, changes are required. Changes are required when a new functionality is
     * added or an existing functionality is updated in the application. Often in both situations,
     * you need to modify the existing code, and that carries the risk of breaking the application’s functionality.
     * For good application design and the code writing part, you should avoid change in the existing code when requirements change.
     * Instead, you should extend the existing functionality by adding new code to meet the new requirements.
     * You can achieve this by following the Open Closed Principle.
     *
     *
     * The Open Closed Principle represents the “O” of the five SOLID software engineering principles
     * to write well-designed code that are more readable, maintainable, and easier to upgrade and modify.
     * Bertrand Meyer coined the term Open Closed Principle, which first appeared in his book Object-Oriented Software Construction,
     * release in 1988. This was about eight years before the initial release of Java.
     *
     * This principle states: “software entities (classes, modules, functions, etc.) should be open for extension,
     * but closed for modification “. Let’s zero in on the two key phrases of the statement:
     *
     * 1 - “Open for extension “: This means that the behavior of a software module,
     * say a class can be extended to make it behave in new and different ways. It is important to note here that
     * the term “extended ” is not limited to inheritance using the Java extend keyword. As mentioned earlier,
     * Java did not exist at that time. What it means here is that a module should provide extension points to alter its behavior.
     * One way is to make use of polymorphism to invoke extended behaviors of an object at run time.
     *
     * 2 - “Closed for modification “: This means that the source code of such a module remains unchanged.
     *
     * It might initially appear that the phrases are conflicting- How can we change the behavior of a module without making changes to it?
     * The answer in Java is abstraction. You can create abstractions (Java interfaces and abstract classes) that are fixed
     * and yet represent an unbounded group of possible behaviors through concrete subclasses.
     * */
}
