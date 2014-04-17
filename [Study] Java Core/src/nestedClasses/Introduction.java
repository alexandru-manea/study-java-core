package nestedClasses;

public class Introduction
{
	/**
	 * NESTED CLASS :: Class defined within another class
	 * 				:: A member of its enclosing class
	 * 				:: Can be declared private, protected, public, or package-private
	 *                 (as opposed to top-level classes, which can only be public or package-private)
	 *
	 *
	 * CLASSIFICATION (examples bellow)
	 * (1). Non-static => INNER CLASSES
	 * (2). Static => STATIC NESTED CLASSES
	 *
	 */

	/*
	 * Example of an inner class
	 */
	class InnerClass {}

	/*
	 * Example of a static nested class
	 */
	static class StaticNestedClass {}


	/**
	 * WHY USE NESTED CLASSES?
	 *
	 * $ LOGICALLY GROUP CLASSES THAT ARE ONLY USED IN ONE PLACE
	 * 	- If a class is useful to only one other class, then it is logical to embed it in that class and keep them toghether
	 * 	- Nesting such helper classes makes the package more streamlined
	 * $ INCREASE ENCAPSULATION
	 * 	- Consider two top-level classes, A and B, where B needs access to members of A that would otherwise be declared private
	 *  - By hiding class B within class A, A's members can be declared private and B can access them
	 *  - In addition, B can be hidded from the outside world
	 * $ INCREASE READABILITY AND MAINTAINABILITY
	 * 	- Place the code closer to where it is used
	 *
	 */


	/**
	 * INNER CLASSES
	 *
	 * -> As with instance methods and variables, an inner class is associated with an instance of its enclosing class and has
	 *    direct access to that objects's methods and fields
	 * -> Because of this association, it cannot define any static members itself
	 *
	 * -> Objects that are instances of an inner class exist within an instance of the outher class
	 * -> It is necessary to first instantiate the outer class, and only after than the inner class (se example bellow)
	 *
	 */

	/*
	 * Example of instantiating an inner class object.
	 */
	class OuterClass
	{
	    class InnerClass
	    {

	    }

	    // instantiation
	    OuterClass outerObject = new OuterClass();
	    OuterClass.InnerClass innerObject = outerObject.new InnerClass();
	}





















}
