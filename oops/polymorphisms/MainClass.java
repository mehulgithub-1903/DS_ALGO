package oops.polymorphisms;

public class MainClass {

	public static void main(String[] args) {
 Dog d=new Dog();
 Pet p =d;
Animal a=d;
 
p.walk(); 
d.walk();
		
	//	greetings("MEHUL",13);
		}
		public static void greetings() {
			System.out.println("welcome to overload");
		}
		public static void greetings (String s) {
		System.out.println("greetings to "+s);
		}
		
		public static void greetings (String s,int count) {
		int i=0;
			while(i <count)
			{
				System.out.println("greetings to "+s);
	  	    i++;
			}
	}

}
