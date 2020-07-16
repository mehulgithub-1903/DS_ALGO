package Algoritms.Recurrsions;

public class test {

	public static void main(String[] args) {
		print(5);
	}
	static void print(int num) {
		if(num<1) return;
		print(num-1);	
		System.out.print(num+" ");
	}

}
