package Algoritms.Recurrsions;

public class pathsInMxNGrid {

	public static void main(String [] args) {
		System.out.println(noOfPaths(5,4 ));
	}
	public static int noOfPaths(int n,int m) {
		if(n==1 || m==1) return 1;
		return noOfPaths(n, m-1)+noOfPaths(n-1, m);
	}
}
