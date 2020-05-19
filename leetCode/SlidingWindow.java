package leetCode;

import java.util.*;

public class SlidingWindow <E>{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n-k+1];
	for(i =0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int s=a.length;
	ArrayDeque<Integer> ans=new ArrayDeque<>();
     for(i =0;i<n;i++) {
    	 if(i<k) {
    		 ans.offerFirst(a[i]);
    	 }else {
      b[i-k]=maxOfQ(ans);
    	  ans.removeLast();
          ans.addFirst(a[i]);
    	 }
     }
  b[i-k]=maxOfQ(ans);
  
  for(int x:b) {
	  System.out.print(x+" ");
  }
	}
static int maxOfQ(ArrayDeque <Integer> name) {

	ArrayList<Integer> al=new ArrayList<Integer>(name);
	int max=0;
	for(int i =0;i<name.size();i++) {
		if(al.get(i)>max) {
			max=al.get(i);
		}
	}
	return max;
	
}
}
