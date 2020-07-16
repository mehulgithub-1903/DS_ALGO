package geeksforgeeks;

import java.util.Scanner;

public class greatestToTheRight {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	int j=n-1;
	for(int k=0;k<n-1;k++) {
arr[k]=maxOfSubArray(arr, k+1, j);
	}
	arr[n-1]=-1;
for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}
	}
static int maxOfSubArray(int a[],int i ,int j) {
	int max=a[i];
	while(++i<=j) {
		if(a[i]>max) max=a[i];
	}
	return max;
}
}
