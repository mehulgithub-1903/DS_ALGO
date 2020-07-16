package strings;

import java.util.Arrays;

public class newClass {
public static void main(String [] args) {
	int arrrr[]= {10,5,7,8,9};
	arrrr=Arrays.copyOf(arrrr, 2*arrrr.length);
	for(int i=0;i<arrrr.length;i++) {
		System.out.println(arrrr[i]);
	}
	/*constructors of string
	String s = new String();
	will create an instance of String with no characters in it.
	 */
	String s1=new String();
	/*
	 To create a String
	initialized by an array of characters, use the constructor shown here:
	String(char chars[ ])
	 */
	char arr[]= {'s','d','e','w','q','a'};
	/////////////////////////////////////////////////////////////////////////////////////
	String s2=new String (arr);
     System.out.println(s2);

	/*
	 * String(char chars[ ], int startIndex, int numChars)
	 */
	String s3=new String(arr,2,3);
	//s3 is ewq
	System.out.println(s3);
	//////////////////////////////////////////////////////////////////////////////////////
	byte [] ascii= {65,66,67,68,69};
	String s4=new String(ascii); //because the constructor accepts argument in byte
	System.out.println(s4);
	System.out.println(new String(ascii,1,3));
	/////////////////////////////////////////////////////////////////////////////////////
	/*
	 * toString();
	 */
	box b=new box(5, 7, 11);
	String s="Box b: "+b;//concats box b
	System.out.println(b);
	System.out.println(s);
	////////////////////////////////////////////////////////////////////////////////////
	String s5="this is a demo for getChars method.";
	int start=0;
	int end=s5.length();
	char buf[]=new char[end-start+1];
//	buf[0]='s';
	s5.getChars(start, end, buf, 0);
	System.out.println(buf);
	char c[]=s5.toCharArray();
	System.out.println(c[3]);
	/*equals--> same characters and in same order\\ and equalsIgnoreCase
	 * To perform a comparison that ignores case differences, call
equalsIgnoreCase( ). When it compares two strings, it considers A-Z to be the
same as a-z.
	 */
	String s6="hello world";
	String s7="Hello World";
	if(s6.equals(s7)) System.out.println("yes");
	else System.out.println("NO");
	if(s6.equalsIgnoreCase(s7)) System.out.println("yes");
	else System.out.println("NO");
	/*
	 * startsWith() and endWith();
	 */
	if(s6.startsWith("hello")) System.out.println(true);
	else System.out.println(false);//same for endWith
	/*
	 * compareTo()  
	 * compareToIgnoreCase()
	 */
	String s9="Mehul";
	String s8="Mahul";
	System.out.println(s9.compareTo(s8));
	System.out.println(s8.compareTo(s9));
	System.out.println(s7.compareToIgnoreCase(s6));
	/*
	 * indexOf() and lastIndexOf()
	 */
	String s10="Hello";
	System.out.println(s10.indexOf('l'));
	System.out.println(s10.lastIndexOf('l'));
	System.out .println(s10.indexOf("ell"));
/*
 * substring
 */
	String s11="hello";
	System.out.println(s11.substring(1, 2));
	
}
}
