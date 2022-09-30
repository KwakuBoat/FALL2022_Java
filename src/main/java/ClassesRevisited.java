package main.java;

/**
 * The following is about class properties. In this segment, you will
 * evaluate how class properties work and what type of declarations
 * can drastically alter a class' or associated object's behavior. All 
 * exercises and code examples should be submitted when completed.
 * @author yusei
 *
 */
public class ClassesRevisited {
	/**
	 * Below is a demonstration of features students should be aware of so as to
	 * create their own classes with a full understanding of what they are doing
	 * - <b><u> and <i> WHY!</i></u></b> 
	 */
	public static void main() {
		
		/*
		 *  Part 1 - Understanding classes and their constructors.
		 *  /
		
		/ *  1a.  Classes
		 *  
		 *  Classes are the basis for nearly all OOP languages. They are a 
		 *  specification for what all objects of its type MUST conform to.
		 *  Much like recipes for food, schematics for machinery, and
		 *  blueprints for everyday projects, class definitions lay the groundwork
		 *  for all objects that will be created using its namesake and irrevocably.
		 *  
		 *  HENCE: A class called "Machine" when instantiated, will automatically
		 *  enforce the following characteristics...
		 *  
		 *  1. Machine objects will be considered to have a datatype of "Machine".
		 *  2. Characteristics of other classes will not be a part of a Machine object's
		 *      underlying definition unless the Machine class definition inherited 
		 *      from it. 
		 *      
		 *      To illustrate, you and I are not related unless we have the same
		 *      ancestor. Even then, I am not guaranteed to be a DIRECTLY 
		 *      related - or even relatable - to you UNLESS you are:
		 *      - my ancestor (any superclass)
		 *      OR
		 *      - a sibling from my household (another object from the same class)
		 *      
		 *  3. Regardless of any differences between instantiated Machine objects,
		 *      all such objects must have their own copy of the data members and
		 *      methods (API) specified in the Machine class definition - no exception!
		 *      
		 *      These details are at the root of the "is-a" relation. An object is a case of
		 *      its associated class AND is a special case of all superclasses.
		 *      
		 *      Exercise 1a - Verify the is-a relationship using Integer, Double, Number,
		 *      and Object as follows:
		 *      
		 *      Set up the following types of variables...
		 *      
		 *      - Object
		 *      - Number
		 *      - Double
		 *      - Integer
		 *      
		 *      ... using assignment '=' between initialized variables 
		 *      
		 *      is an Integer a Number? (Integer vs Number)
		 *      i.e., does "Integer z = Number a;" work as a valid statement? No there is going to be an error
		 *
		 * 		but
		 *      
		 *      What of...
		 *      
		 *      (Number vs Integer)?
		 *      (Double vs Number)?
		 *      (Number vs Double)?
		 *      (Object vs Integer)?
		 *      (Integer vs Object)?
		 *      (Double vs Object)?
		 *      (Object vs Double)?
		 *      (Number vs Object)?
		 *      (Object vs Number)?
		 *      (Double vs Integer)?
		 *      (Integer vs Double)?
		 *      
		 *      All negative cases should be entered in comments along
		 *      with the associated Errors/Warnings they bring up?
		 *      
		 *      All positive cases should be actual uncommented code.
		 *      
		 *      In Java, we have access modifiers which help decide the
		 *      circumstances under which an objects properties or API
		 *      will be used. With no explicit specifier, variables, objects,
		 *      classes (and their constructors) would be treated as package
		 *      -private. This means the items in question are public to all
		 *      members of the same package, but private elsewhere. 
		 *      Because of this, it is important to provide the descriptions
		 *      "public", "protected", and "private" to all declarations that
		 *      are to have a general policy associated with their usage.
		 *      
		 *      The "private" modifier is invisible from outside of the class 
		 *      featuring the declaration. Any such declared properties must
		 *      be accessed by methods belonging to that class. If the data
		 *      is housed in an instantiated object, the methods in that object's
		 *      API will be the only way to interact with it. Private members
		 *      are NOT inherited and remain within that particular class' 
		 *      definition.
		 *      
		 *      The "protected" modifier allows for the declared Item to be
		 *      inherited into subclasses. NOTE: Java treats it as public from
		 *      within the current package. THIS IS NOT UNIFORM TO 
		 *      MOST OOP LANGUAGES.
		 *      
		 *      The "public" modifier allows for direct access to a class or
		 *      object's property. Public properties are also inherited to
		 *      subclasses.
		 *     
		 *      Exercise: In your previou
		 */
		
		/* 
		 *  1b. Constructors
		 *  
		 *  A constructor is a method for creating instances (objects) 
		 *  of its associated class definition. It shares the name of the class
		 *  and, in turn, the datatype of the objects it instantiates. Many OOP
		 *  languages will provide an invisible default constructor created
		 *  alongside the class definition. Java does it too! The provided
		 *  default constructor returns an object with its underlying fields
		 *  holding null values (uninitialized).
		 *  
		 *  Exercise checkpoint: Create a class called "split complex". At
		 *  present it has no constructor defined. It also has two fields
		 *   'a' and 'b', which are Doubles. Then create accessor (get)
		 *  and mutator (set) methods for them. Finally, instantiate a
		 *  split complex object (using the default constructor and print 
		 *  the values returned.
		 *  
		 *  Note: For a simple intro to split complex numbers the following
		 *  may help: https://en.wikipedia.org/wiki/Split-complex_number
		 *  
		 *  Constructors - PART II
		 *  
		 *  In the event we need a more descriptive standard for creating
		 *  objects, we will have to EXPLICITLY create the constructor
		 *  ourselves. This will require that we have at least one method 
		 *  bearing the exact name of the class followed by a method
		 *  with the exact details we wish to use for initialization. Once
		 *  this happens, the default constructor will cease to exist and
		 *  the only way to restore it is by EXPLICITLY providing an
		 *  empty constructor. From here on out, the compiler will expect 
		 *  all constructor calls to match the signature (or argument list)
		 *  of an explicitly defined constructor. 
		 *  
		 *  Exercise checkpoint:
		 *  
		 *  Create a constructor for the split complex class that takes 2
		 *  arguments for the assignment of a and b. Try calling the 
		 *  original default constructor. (This shouldn't work; insert error
		 *  message in a comment.) Next, explicitly restore the default
		 *  constructor and confirm that it works by creating another 
		 *  split complex object.
		 *  
		 *  
		 *  Constructors - PART III
		 *  
		 *  Constructors can also call other methods of its class in addition
		 *  to operating on data members. This includes other constructors.
		 *  
		 *  Exercise checkpoint:
		 *  
		 *  Modify your split complex constructor to use mutator methods 
		 *  to initialize data members. 
		 *  
		 */
		
		/*
		 * 2. The object life-cycle.
		 * 
		 *  When an object is created by a constructor the objects life-cycle
		 *  begins. Other languages that do not automatically perform 
		 *  garbage collection have destructor methods as a tool to end the
		 *  life-cycle explicitly. An object's properties may be passed around 
		 *  in methods and other contexts invisibly using a special keyword
		 *  such as "this" in Java, C++, JavaScript and others, or "self" in
		 *  various other languages. "this" is passed as a 0th ('zero'th) 
		 *  argument in many methods. By means of such a concept, we can
		 *  keep track of the current object even when working with similar
		 *  objects with identical properties. The "this" keyword is used to
		 *  refer to the current object's context when methods or member
		 *  functions are called on it.
		 *  
		 *  Exercise 2a
		 *  
		 *  Create a "copy constructor" - a constructor that takes as an  
		 *  argument a split complex object and creates another
		 *  object with identically initialized fields (use the "this" keyword
		 *  to accomplish this task). Also create a constructor which takes a 
		 *  single 'double' argument and calls the other constructor which
		 *  takes two double arguments. It passes along two copies of the
		 *  single double argument it received to the second constructor.
		 *  
		 *  The object's life-cycle - PART II
		 *  
		 *  The context of the object's life cycle can be side stepped using 
		 *  the keyword "static". This allows us to retain details that we want 
		 *  to keep irrespectively of any one - or even group of - object's 
		 *  instantiation. 
		 *  
		 *  Exercise 2b
		 *  
		 *  Create a static variable called created which each constructor in
		 *  the current class increments. In addition, create a static method
		 *  called multiplier which multiplies two split-complex numbers and
		 *  returns a split complex number. Instantiate 2 of such numbers to 
		 *  be multiplied. Then call the multiplier method. After that, print 
		 *  the value of created using the classname.property call.
		 *  
		 *  
		 */
		
	}

}
