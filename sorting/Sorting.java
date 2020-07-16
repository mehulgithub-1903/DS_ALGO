package sorting;

public class Sorting {

	public static void main(String[] args) {
	int a[]= {5,6,9,8,7,18};
	int len=a.length;
			for(int i =0;i<len;i++)
			{
				int minInd=i;
				for(int j=i;j<len;j++)
					{
					if(a[minInd]>a[j])
					{
						int temp=a[minInd];
						a[minInd]=a[j];
						a[j]=temp;
						
					}
					
					}
			}
	for(int element:a)
		System.out.println(element+" ");
	}

}
