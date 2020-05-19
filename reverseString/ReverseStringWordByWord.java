  package reverseString;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
	String str="   the sky is    blue";
	String rev="";
	int i =str.length()-1;
	while(i>=0) {
		
		while(i>=0 && str.charAt(i)==' ') i--;
		 int j =i;
		 if(i<0) break;
		 while(i>=0 && str.charAt(i)!=' ') i--;
      if(rev.isEmpty()) {
    	 rev=rev.concat(str.substring(i+1,j+1));}
    	 else {
    		 rev=rev.concat(" "+str.substring(i+1,j+1));
    		    		 
    	 }
      }
	System.out.println(rev);
}
		 
	}