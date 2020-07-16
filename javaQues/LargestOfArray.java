package javaQues;

public class LargestOfArray {

	public static void main(String[] args) {
		int a[]= {1,5,4,8,9,6,3};
		double start=System.currentTimeMillis();
//		int max=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>max) max=a[i];
//		}
		int i=1,j=a.length-1;
	int max=a[0];
		while(i<j) {
			if(a[i]>a[j]) {
				max=a[i];
				j--;
			}else {
				max=a[j];
				i++;
			}
		}
		System.out.println(max);
		double end=System.currentTimeMillis();
		System.out.println((end-start)/1000);
		
	}

}
