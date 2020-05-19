package reverseString;

public class ReverseString{

	public static void main(String[] args) {
	String name="mehul is a good boy";
	//char a[]=new char[name.length()];
	for(int i =0;i<name.length();i++) {
		System.out.print(name.charAt(name.length()-1-i));
	}
	}

}//reversing string letter by letter
