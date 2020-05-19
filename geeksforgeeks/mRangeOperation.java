package geeksforgeeks;

import java.util.Scanner;

public class mRangeOperation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	
		int T=sc.nextInt();
		while(T>0) {
			T--;
			int N=sc.nextInt();
			int A[]=new int[N];
			int M=sc.nextInt();
			while(M>0) {
				M--;
				int a=sc.nextInt();
				int b=sc.nextInt();
				int k=sc.nextInt();
				
				for(int i =a;i<=b;i++) {
					A[i]+=k;
				}
				
			}
			int max=0;
			
			for(int i=0;i<N;i++) {
				if(A[i]>max) {
					max=A[i];
				}
			}
			System.out.print(max);
			System.out.print("\n");
	}

}
}