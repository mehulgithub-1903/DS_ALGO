package sorting;

public class BubbleSorting {

	public static void main(String[] args) {
//WE CODE PEACE;$$
		int a[]= {5,8,6,3,9,7};
		for(int i=0;i<6;i++)
		{
			for(int j =0;j<5;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
							
				}
			}
		}
		for(int item:a)
		{		
			System.out.print(item +" ");
	}

	}
}

