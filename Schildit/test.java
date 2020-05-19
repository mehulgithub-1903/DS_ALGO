package Schildit;

import java.util.Scanner;

public class test {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		var avg=new int[6];
		System.out.println(avg);
//		int  p=26;
//		int b=98;
//		float c=
//		System.out.println(c);
//		//char=U+02C2;
//	   double s=IntToBol(p);
//	System.out.println((int)s);
//	
	}
	public static double IntToBol(int a) {
		int i =0;
		double b=0;
		while(a!=0) {
			
			if(a!=1) {
			b+=(a%2)*(Math.pow(10, i));
			a/=2;
			i++;
			}
			if(a==1) {
				b+=Math.pow(10, i);
				break;
			}
			
		}
		return b;
		}
}
