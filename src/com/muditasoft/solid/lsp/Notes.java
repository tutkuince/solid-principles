package com.muditasoft.solid.lsp;

public class Notes {
    /**
     * Liskov Substitution Principle
     *
     * The Liskov Substitution Principle is one of the SOLID principles of object-oriented programming
     * (Single responsibility, Open-closed, Liskov Substitution, Interface Segregation and Dependency Inversion).
     * We have already written about the single responsibility principle, and these five principles
     * combined are used to make object-oriented code more readable, maintainable and easier to upgrade and modify.
     *
     * Liskov Substitution Principle states the following: “in a computer program, if S is a subtype of T,
     * then objects of type T may be replaced with objects of type S (i.e., objects of type S may substitute objects of type T)
     * without altering any of the desirable properties of that program (correctness, task performed, etc.)”.
     * Simply said, any object of some class in an object-oriented program can be replaced by an object of a child class.
     * In order to understand this principle better, we’ll make a small digression to briefly remind ourselves about the concept of inheritance
     * and its properties, as well as subtyping, a form of polymorphism.
     *
     * Inheritance, Polymorphism, Subtyping
     *
     * Inheritance is a concept fairly simple to understand – it is when an object or a class are based on another object or class.
     * When a class is “inherited” from another class, it means that the inherited class (also called subclass, or child class)
     * contains all the characteristics of the superclass (parent class), but can also contain new properties.
     * Let’s illustrate this with a common example: if you have a class Watch , you can inherit from that class to get a class PocketWatch .
     * A pocket watch is still a watch, it just has some additional features.
     *
     * Another example would be a class called Woman with a child class called Mother.
     * A mother is still a woman, with the addition of having a child. This brings us to the next term we should explain,
     * which is called polymorphism: objects can behave in one way in a certain situation, and in another way in some other situation.
     * In object-oriented programming, this is called context-dependent behavior.
     * To use the last example: a mother, when taking a walk with her child or attending a school parent’s meeting,
     * will behave as a mother. But when she is out with her friends, at work or simply doing errands, she will behave as a woman.
     * (As you can see, this difference is not that strict.)
     *
     * Subtyping is a concept that is not identical to polymorphism. However, the two are so tightly connected
     * and fused together in common languages like C++, Java and C#, that the difference between them is practically non-existent.
     * We will still give a formal definition of subtyping, though, for the sake of completeness,
     * but the details will not be discussed in this article. “In programming language theory,
     * subtyping (also subtype polymorphism or inclusion polymorphism) is a form of type polymorphism in which a subtype is a datatype
     * that is related to another datatype (the supertype) by some notion of substitutability, meaning that program elements,
     * typically subroutines or functions, written to operate on elements of the supertype can also operate on elements of the subtype.
     * If S is a subtype of T, the subtyping relation is often written S <: T, to mean that any term of type S can be safely used in a context
     * where a term of type T is expected.”
     * */
}
