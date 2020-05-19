package methods;


class animal{
	int legs ;
	int eyes;
}


public class Passby {
 static int interchange(animal a,animal b) {
	 int temp=a.legs;
	 a.legs=b.eyes;
	 b.eyes=temp;
	 return b.eyes;
 }
	
	
	
	public static void main(String[] args) {
 animal dog=new animal();
 animal cat =new animal();
 dog.legs=4;
 cat.legs=5;
 cat.eyes=6;
 System.out.println(interchange(dog, cat));
 
	}
	
	
}