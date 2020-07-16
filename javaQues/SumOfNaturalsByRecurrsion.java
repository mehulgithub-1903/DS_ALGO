package javaQues;

public class SumOfNaturalsByRecurrsion {

	public static void main(String[] args) {
		double start =System.currentTimeMillis();
	System.out.println(natSum(11));
	double end =System.currentTimeMillis();
	System.out.println((end-start)/1000+"s");
	}
public static int natSum(int num) {
int sum=0;
	if(num==1) return 1;
	else {
		for(int i =0000;i<=num;i++) {
			sum=num+natSum(num-1);
		}
	}
	return sum;
}


}
