package oops;
import java.util.Scanner;
class student{
	int roll;
	int marks;
	
 student(int marks,int b){
		this.marks =marks;
		roll=b;
	}
}
public class Constructors {

	public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		  int l=sc.nextInt();
		 int  m=sc.nextInt();
		  int n=sc.nextInt();
		  int k=sc.nextInt();
		  
		  
		  student aman=new student(l,m);
		  student jai=new student(n,k);
		  
		  System.out.print("roll"+" "+"marks");
		  System.out.print("\n");
		  System.out.print(aman.roll+" "+aman.marks);
		  System.out.print("\n");
		  System.out.println(jai.roll+" "+jai.marks);
	}

}
