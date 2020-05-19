package oops;

import oops.Testclass.*;

public class Nestedclass {

	public static void main(String[] args) {
     
		Testclass obj0=new Testclass();
		A obj=new Testclass.A();
		B obj1=obj0.new B();//non static nested class ka object tab hi ban sakta he jab
                                               //parent clss ka object bana ho		
	}

}
