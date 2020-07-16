package HackerRank;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		System.out.println(isAnagram(a, b));
	}
	 static boolean isAnagram(String a, String b) {
		 boolean ana=false;  
		 int [] af= new int[128];
		   int [] bf=new int [128];
		   for(int i=0;i<a.length();i++){
		          
		           
		           if(a.charAt(i)>90){
		                   af[a.charAt(i)-32]++;
		           }else {
		        	   af[a.charAt(i)]++;
		           }
		           if(b.charAt(i)>90){
		                   bf[b.charAt(i)-32]++;
		           }else {
		        	   bf[b.charAt(i)]++;
		           }
		   }
		  
		 for(int i=0;i<af.length;i++) {
			 if(af[i]==bf[i]) {
				 ana=true;
			 }else {
				 ana=false;
				 return ana;
			 }
			 
		 }
		return ana;
	 }
}
