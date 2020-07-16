package javaQues;
import java.util.*;
public class prmeNumberFunc {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int m=sc.nextInt();
PrimeBet(n, m);

	}
public static void PrimeBet(int a,int b) {
	for(int i=a;i<b;i++) {
		if(isPrime(i)) System.out.println(i);
	}
	}
public static boolean isPrime(int num) {
	for(int i=2;i<num;i++) {
	if(num%i==0) return false;
}
	return true;
	
}

}
