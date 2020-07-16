package strings;

public class Palindrome {

	public static void main(String[] args) {
		String s="beeeebb";
		System.out.println(CheckPalindrome(s));

	}
 static boolean CheckPalindrome(String str) {
	 char arr[]=new char[str.length()];
	 arr=str.toCharArray();
	int i=0,j=arr.length-1;
	boolean isPalindrome=false;
	 while(i<=j) {
		 if(arr[i]==arr[j]) {
			 isPalindrome=true;
			 i++;
			 j--;
		 }
		 else {
			 isPalindrome=false;
			 return isPalindrome;
		 }
	 }
	 return isPalindrome;
 }
}
