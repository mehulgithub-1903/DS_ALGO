package methods;
import java.util.Scanner;
public class Introductions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int num1=56;
int num2=78;
	System.out.println(maxOf(num1, num2));
	sayHi();
	sayHi();
	sayHi();
	}
	
static  int maxOf(int a,int b)
{
	  return a>b?a:b;
//	  if(a>b)       // or 
//		  return a;
//	  else 
//		  return b;

}
	static void sayHi()
	{
		System.out.println("jai hind doston");
	}

}
