package HackerRank;

import java.util.Scanner;

public class SumOfSubArraysIsNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(SumOfSub(arr, i, j)<0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
public static int SumOfSub(int [] a,int start,int end) {
	int sum=0;
	for(int i=start;i<=end;i++) {
		sum+=a[i];
	}
	return sum;

}
}
