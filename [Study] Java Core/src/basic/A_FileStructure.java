package basic;

public class A_FileStructure {

	/**
	 * TYPICAL JAVA CLASS STRUCTURE
	 * ----------------------------
	 * 
	 * -> The PACKAGE statement has to be (if present) the first statement in the class definition, otherwise compilation will fail
	 * 		- All code written without a package statement will go into the default package - will not be accessible from outside
	 * 
	 * -> The IMPORT statements will follow (if present) the package statement
	 * 		- Import a.b.* will import all classes, but not child packages, fields, or methods
	 * 		- Only one wildcard is possible and it has to be at the end, e.g. import a.b.*.* or import a.*.b are not correct
	 * 		- Can use any of * or qualified name approaches, the compiler figures out what is required
	 * 		- Redundant imports: java.lang, same package, both * and qualified
	 * 		- If a class is imported explicitly twice, but from different package paths, the code does not compile. e.g., java.util.Date & java.sql.Date
	 * 			- It does compile if one is explicit and the other with wildcard. e.g., java.util.Date and java.sql.*
	 * 			- In the example above, if you want to use both Date types, import one and define one with its fully qualified name or define both like this
	 * 		- The explicit import takes precedence over the wildcard one
	 * 
	 * ->  CLASS declaration (required and has to follow the package and the import statements): [] for required, () for optional
	 * 		(<access modifier>) (<nonaccess modifier>) [class] [<name>] (extends) (implements) [{...}]
	 * 
	 * -> Instance & class variables and methods will follow
	 * 
	 * 
	 * OBSERVATIONS
	 * ------------
	 * 
	 * -- Can define a combination of classes and interfaces in any order in a source file
	 * 	- Only one public class/interface can be defined in a source file; its name has to match that of the file
	 * 	- The package and import statements will apply to all classes/interfaces
	 * 
	 * -- Main method
	 * 	- Can define parameter as variable argument (varargs), e.g. public static void main(String... anyName)
	 *  - Public and static can interchange places
	 *  - All command-line parameters are treated as strings: e.g., --- javac Zoo.java --- java Zoo Cat Dog => args[0] = "Cat" & args[1] = "Dog"
	 *  - If you want spaces inside an argument, use quotes: --- java Zoo "Wild Cat" Dog
	 *  
	 */
}
