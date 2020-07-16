package geeksforgeeks;

import java.util.Scanner;

public class matrixInterchange {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int m=sc.nextInt();
    int n=sc.nextInt();
    int mat[][]=new int [m][n];
    for(int i=0;i<m;i++) {
    	for(int j=0;j<n;j++) {
    		mat[i][j]=sc.nextInt();
    	}
    }
    for(int i=0;i<m;i++) {
    	for(int j=0;j<n;j++) {
    		System.out.print(mat[i][j]+"\t");
    	}
    	System.out.println();
    }
    System.out.println();
    for(int i=0;i<m;i++) {
    	int temp;
    	temp=mat[i][n-1];
    	mat[i][n-1]=mat[i][0];
    	mat[i][0]=temp;
    }
    for(int i=0;i<m;i++) {
    	for(int j=0;j<n;j++) {
    		System.out.print(mat[i][j]+"\t");
    	}
    	System.out.println();
    }
	}

}
