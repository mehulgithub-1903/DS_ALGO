package array;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i;
	int n=sc.nextInt();
	
	int marks[]=new int[n];
	
	System.out.println("please enter marks");
	for(i=0;i<n;i++)
	{
		marks[i]=sc.nextInt();
	}

	for(i=0;i<n;i++)
	{
		System.out.print(marks[i]+"*");
	}
	}

}
