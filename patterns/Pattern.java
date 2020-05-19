package patterns;

public class Pattern {

	public static void main(String[] args) {
		int i,j;
		int n=9;
		for(i=1;i<=n/2+1;i++)
		{
for(j=1;j<=i;j++)
{
	System.out.print("* ");
}System.out.println(" ");
		}
		for(i=1;i<=n/2;i++)
		{
			for(j=n/2+1-i;j>=1;j--)
				System.out.print("* ");
			
		System.out.println(" ");
		}
	}

}
