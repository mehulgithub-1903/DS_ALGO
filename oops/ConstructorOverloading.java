package oops;


class vehicle{
	int wheels;
	String color;                             
	vehicle(int wheels){                    // this is called constructor overloading
		this.wheels=wheels;              //where u can make two constructors of same name but with  
		                                            //         differnent kinds of argument in them
		color="white";                      //like first one has only one argument but the second one has two arguments
	}                                               //ek bar vehicle bana liya phir default constructor call nAHI KAR SAKTE HE 
	vehicle(int a, String shade){
		wheels=a;
		color=shade;                              
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
	  
		vehicle car=new vehicle(5);
vehicle bus =new vehicle(10,"yellow");
System.out.println("number of wheels in bus of "+bus.color+"color"+"is"+bus.wheels);
	}

}
