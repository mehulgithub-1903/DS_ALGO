package geeksforgeeks;
import java.util.*;
import java.lang.*;
public class ZerosToFive {

	public static void main(String[] args) {
		int a=10021056;
		System.out.println(convert0To5(a));

	}
 static int convert0To5(int num) {
	
	 int result=0;
	 int ptr=0;
	 while(num>0) {
	 if(num%10==0) {
		 	result+=5*Math.pow(10, ptr);
		 	num/=10;
		 	ptr++;	 
	 }else {
		 result+=(num%10)*Math.pow(10, ptr);
		 num/=10;
		 ptr++;
		 
	 }
	 
	 }
	 return result;
	 
 }
}
