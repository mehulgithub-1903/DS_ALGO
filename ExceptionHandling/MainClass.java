package ExceptionHandling;

public class MainClass {

	public static void main(String[] args) {
System.out.println("this has to run anyway");

try { 
	int a[]=new int[5];
System.out.println(a[5]); 
}catch(ArithmeticException e) {
	System.out.println(e.getMessage());
}catch(ArrayIndexOutOfBoundsException e) {
System.out.println(e.getMessage());
}finally {
	System.out.println("sorry for the inconvenience caused");
}
	}
//public static void just(int a,int b) { 
//	try {
//	System.out.println( a/b);
//	}catch(ArithmeticException th) {
//		System.out.println(th.getMessage()+ "\n"+"this is the given error\r ");
//	}
//	
//	}
//public static void call(int a,int b) {
//	just(a,b);
//}
}

