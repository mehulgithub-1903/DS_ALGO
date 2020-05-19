package oops;
 class Phone{
	 boolean hasFingerprint;
	 String color;
	 int ram,rom;
	  public void PRO() {
		  System.out.println("phone is exynos");
	  }
	  public void des() {
		  System.out.println("my phone has "+ ram +"ram"+"and"+rom+"rom"+"color is"+color);
	  }
 }
 class Dog{
	 
 }
 
public class MainClass {

	public static void main(String[] args) {
		 Phone s10 =new Phone();		
	Phone iphone =new Phone();		

	s10.ram=8;
	iphone.ram=8;
	s10.rom=128;
	s10.color="white";
	iphone.rom=64;
	s10.des();
	s10.PRO();
iphone.des();
	}

}
