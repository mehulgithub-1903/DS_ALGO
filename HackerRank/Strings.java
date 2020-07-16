package HackerRank;

import java.util.Scanner;

public class Strings {
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        System.out.println(A.length()+B.length());
	        if(A.compareTo(B)>0) {
	        	System.out.println("Yes");
	        }else System.out.println("No");
	   System.out.println(A.replace(A.charAt(0),(char) (A.charAt(0)-32))+" "+B.replace(B.charAt(0),(char) (B.charAt(0)-32)));
	      B.replace(B.charAt(0),(char) (B.charAt(0)+26));
	   
	    }
}
