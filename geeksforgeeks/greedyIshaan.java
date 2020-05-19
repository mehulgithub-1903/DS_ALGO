package geeksforgeeks;

import java.util.Scanner;
//two pointer algo without array sort
public class greedyIshaan {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);	
	int T=sc.nextInt();
	while(T>0) {
		T--;
		int N=sc.nextInt();
		int A[]=new int[N];
		for(int k =0;k<N;k++) {
		A[k]=sc.nextInt();
		}
		int i=0;
		int j=A.length-1;
		while(j>i) {
			if(A[i]>A[j]) {
				i++;
			}
			else {
				j--;
			}
		
		}
	System.out.println(A[j]);
	}
	
	}

}
