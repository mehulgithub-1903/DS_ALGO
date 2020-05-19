package patterns;

public class Pattern22 {

	public static void main(String[] args) {
		int i,j,n=5;
		System.out.println("*");
		for(i=1;i<=n-2;i++)
		{
			System.out.print("*");
			for(j=1;j<i;j++)
			{		System.out.print(" ");
			}
			System.out.print("*");
			System.out.print("\n");
		}
	
		for(i=1;i<=n;i++)
		{
			System.out.print("*");
		}

	}

}
