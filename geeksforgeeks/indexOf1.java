package geeksforgeeks;

import java.util.Scanner;

public class indexOf1 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in); 
			int t=sc.nextInt();
			while(t>0){
			    --t;
			int n =sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int res=index(arr, n);
			System.out.println(res);
			
			}

	}
		static int index(int a[],int n) {
	if(a[0]==1) return 0;
		if(a[n-1]==0) return -1;
			int low=0;
			int high=n-1;
	        int mid=0;
			while(low<=high) {
		            mid=(low+high)/2;
		            if(a[mid]==1 && a[mid-1]==1){
		                high=mid-1;
		                continue;
		            }else if(a[mid]==0){
		                low=mid+1;
		                continue;
		            }else{
		                return mid;
		            }
				}
				return mid;
		}
}
