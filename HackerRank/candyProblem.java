 	package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class candyProblem {
	public static void main(String[] args) {
int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of children");
		int s=sc.nextInt();
int arr[]=new int[s];
System.out.println("enter ratings");
for(i=0;i<s;i++) {
	
arr[i]=sc.nextInt();
}

		System.out.println(candies(s,arr));

		
}
	public static int  candies(int n,int a[]) {

int s=0;

int can[]=new int[n];
Arrays.fill(can,1);
for(int i =0;i<n-1;i++) {
		if(a[i]<a[i+1]) {
		can[i+1]=can[i]+1;
		}
	
}
	for(int i=n-1;i>=1;i--) {
		if(a[i]<a[i-1] && can[i-1]<=can[i]) {
	can[i-1]=can[i]+1;
		}
	}
		for(int i=0;i<n;i++) {
		s=s+can[i];
		}
		return s;
	}
}
