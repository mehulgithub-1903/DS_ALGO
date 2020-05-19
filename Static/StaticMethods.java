package Static;
/*
 * If you apply static keyword with any method, it is known as static method.

 A static method belongs to the class rather than the object of a class.
 A static method can be invoked without the need for creating an instance of a class.
 A static method can access static data member and can change the value of it.
 * 
 Restrictions for the static method
There are two main restrictions for the static method. They are:

The static method can not use non static data member or call non-static method directly.
this and super cannot be used in static context.
 */
public class StaticMethods {   // error because a is non static if we make a a static Variable then the error will be 
	                                              //will be gone
	 static int a=40;
	public static void main(String [] args) {
		System.out.println(a);
	}

}
