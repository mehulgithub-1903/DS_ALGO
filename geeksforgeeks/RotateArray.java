package geeksforgeeks;
import java.util.*;
public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int temp;
		int  i;
		int N =sc.nextInt();
		int D =sc.nextInt();
		int arr[]=new int[N];
		for(i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[D-1]);
//		 rotateArray(arr, N, D);
//	for(i=0;i<N;i++) {
//		System.out.print(arr[i]+" ");
//	}
	}
static int [] rotateArray(int a[],int N,int D) {
	//this uses less space
	int first;
	while(D>0) {
		D--;
	first=a[0];
	for (int i=0;i<N-1;i++) {
		a[i]=a[i+1];
		
	}
	a[N-1]=first;
	}
//	int i;
//	int temp[]=new int[D];
//   	
//	for( i=0;i<D;i++) {
//		temp[i]=a[i];
//	}
//	 for(i=0;i<N-D;i++) {
//		 a[i]=a[i+D];
//	 }
//	 for( i=0;i<D;i++) {
//		 a[N-D+i]=temp[i];
//	 }
	
	
	return a;
	
}
}
