package twoPointerAlgorithms;

import java.util.Arrays;
 

public  class Twopointer {
 public static void main(String [] args) {

	 int arr[]= {2,4,-1,3,1,0,3};
	//int s=arr.length;
	
	System.out.println(isTriplet(arr,arr.length));

 }
 public static boolean twoSum(int a[],int i,int x) 
 {               
 	Arrays.sort(a);                //function for two sum array
 	int j=a.length-1;             //any to numbaers in an array array 
 	                                            // sum is eqaul to x
 	while(i<j) {
 	if(a[i]+a[j]<x) {
 		i++;
 	}else if(a[i]+a[j]>x) {
 		j--;
 	}else {
 		return true;
 	}
 }
 	return false;
 }
 public static boolean isTriplet(int a[],int n) {
  Arrays.sort(a);	

	 for(int i=0;i<n-2;i++) {
		if(twoSum(a,i+1,-a[i])) return true;
	 }
	 return false;
}

}
