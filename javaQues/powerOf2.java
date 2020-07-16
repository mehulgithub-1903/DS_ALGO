package javaQues;

public class powerOf2 {

	public static void main(String[] args) {
		int a=64;
		long k=decTobin(a);
		double s=Math.log10(k);
		if((int) s==s) {
			System.out.println(a+" = "+"2^"+(int) s);
		}else System.out.println("no");
	
	}
public static long decTobin(long  num) {
long i =0,sum=0;
	while(num>=1) {
	sum=(long) (sum+(num%2)*Math.pow(10,i));
	i++;
	num/=2;
	}

return sum;
}

}
