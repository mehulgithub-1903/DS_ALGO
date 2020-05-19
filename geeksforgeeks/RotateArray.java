package geeksforgeeks;
import java.util.*;
public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int temp;
		int i;
		int N =sc.nextInt();
		int D =sc.nextInt();
		int temp[]=new int[D];
       	int a[]=new int[N];
		for(i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<D;i++){
		    temp[i]=a[i];
		}
		for(i=0;i<N-D;i++){
		    a[i]=a[D+i];
		}
		for(i=0;i<D;i++){
		    a[N-D+i]=temp[i];
		}
		for(i=0;i<N;i++){
		    System.out.print(a[i]);
		    System.out.print(" ");
		    }
		    
		 System.out.print("\n");
		 
	}

}
