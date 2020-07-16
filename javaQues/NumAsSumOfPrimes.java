package javaQues;

import java.util.Scanner;

public class NumAsSumOfPrimes {

	public static void main(String[] args) {
	long Start=System.currentTimeMillis();
	int flag=0;
		Scanner sc=new Scanner(System.in);
		int Sum=sc.nextInt();
		if(Sum%2!=0) {
			if((isPrime(Sum-2))) {
			System.out.println(Sum + " = 2 " + " + "+ (Sum-2));
			}
			else
			{
				System.out.println("NO");
			}
		}else {
		for(int i=2;i<Sum;i++) {
			if(isPrime(i) && isPrime(Sum-i)) {
				System.out.println(Sum + " = "+ i + " + "+ (Sum-i));
				flag=1;
				//break;
			}else {
				flag=0;
			}
		}
	}
		if(flag==0) {
			System.out.println("NO");
		}
		long End =System.currentTimeMillis();
		System.out.println((End-Start)/1000+"s");
	}
	public static boolean isPrime(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2;i<num;i++) {
		if(num%i==0) return false;
	}
		return true;
}
}