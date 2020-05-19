package anagrams;

public class ReverseString {

	public static void main(String[] args) {
String test="I love java,the coffee";
 char a[]=new char[test.length()];
for(int i =0;i<test.length();i++) {
	
	a[test.length()-i-1]=test.charAt(i);
}
  
  
  for(int i =0;i<=test.length()-1;i++)
	{
		System.out.print(a[i]);
	}


	
	}
}
