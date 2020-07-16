package Algoritms.Recurrsions;

public class fastPow {
static int step=0;
	public static void main(String [] args) {
		System.out.println(fastPower(3, 15));
		System.out.println(step);
	}
public static int fastPower(int a,int b) {
	step++;
	if(b==0) return 1;
	
//	return a*fastPower(a, b-1);	
	
	if(b%2==0) return fastPower((int) Math.pow(a, 2), b/2);
	if(b%2!=0) return a*fastPower(a, b-1);
	return 0;
}
}
