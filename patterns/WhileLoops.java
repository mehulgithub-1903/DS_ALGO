package patterns;
import java.util.Scanner;
public class WhileLoops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int i;
		int r=0;
//int digits=(int)Math.log10(n)+1;??ln(digits);
int temp=n;
while(n!=0)
{
r=r*10+n%10;
n/=10;
}
if(temp==r)
{
	System.out.println("yes it is a palinidrome");
	
}
else
	System.out.println("no");
	}

}
