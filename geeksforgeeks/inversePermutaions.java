package geeksforgeeks;
import java.util.*;
public class inversePermutaions{

	public static void main(String [] args) {
     Scanner sc=new Scanner(System.in);
     int T;
	T=sc.nextInt();
	while(T>0) {
		T--;
		int N=sc.nextInt();
		int A[]=new int[N];
		for(int k =0;k<N;k++) {
		A[k]=sc.nextInt();
		}
		int B[]=new int[N];
		for(int i =0;i<N;i++) {
			B[A[i]-1]=i+1;
		}
		for(int i=0;i<N;i++) {
        System.out.print(B[i]+" ");		
		}
		System.out.print("\n");
		}

	}
	
}
