package Set;

import java.util.*;

public class zeroSumSubArray {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		 int a[]=new int[n];
         for(int i =0;i<n;i++ ){
             a[i]=sc.nextInt();
          }
	//int k=13;
		int sum=0;
		Set<Integer> s=new HashSet<Integer>();
		boolean found=false;
		for(int e:a) {
			s.add(sum);
			sum+=e;
			if(s.contains(sum/*-k*/)) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("found "+found);
		}else {
			System.out.println("found "+found);
		}
		
/*if you want to find the k sum subarray replace 
int k=;
s.contains(sum-k);
	*/
	
	}

}
