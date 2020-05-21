package Set;

import java.util.*;

public class zeroSumSubArray {

	public static void main(String[] args) {
	
		int a[]= {3,4,-1,4,3,-6,-7,2};
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
