package geeksforgeeks;

import java.util.Scanner;

public class KthSmallestElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int k=sc.nextInt();
		while(k-1>0) {
			k--;
			arr[IndexMinOfArray(arr)]=maxOfArray(arr);
		}
System.out.println(arr[IndexMinOfArray(arr)]);
	}
	static int maxOfArray(int a[]) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) max=a[i];
		}
		return max;
}
	static int IndexMinOfArray(int a[]) {
		int j=0;
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				j=i;
			}
		}
		return j;
	}
}
