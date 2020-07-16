package geeksforgeeks;

import java.util.Scanner;

public class nthNumWithPrimeDigits {
public static void main(String []args) {

	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int i=1,count=0;

		while(count<n) {
	if(areDigitsPrime(i)) count++;
	i++;
		}
		System.out.println(i-1);

}
public static boolean areDigitsPrime(int num) {

boolean arePrime=false;	
	while(num!=0) {
		if(PrimeOrNot(num%10)) {
			arePrime=true;
		}
		else return false;
		num=num/10;
	}
	
	return arePrime;
}
public static boolean PrimeOrNot(int num) {
boolean isPrime=false;
	if(num==1) return isPrime;
	if(num==2) return true;
	if(num%2==0) return false;
	for(int i=2;i<num;i++) {
		if(num%i==0) return false;
		else isPrime=true;
	}	
	return isPrime;
}
}
