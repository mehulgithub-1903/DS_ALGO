package geeksforgeeks;

import java.util.*;


public class ArrayListOperation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t-- > 0)
	{
	    // Declaring ArrayList 
	    ArrayList<Character> clist = new ArrayList<Character>();
	    
	    int q = sc.nextInt();
	    
	    // Looping for queries
	    while(q-- > 0)
	    {
	       char ch = sc.next().charAt(0);
	       Geeks obj = new Geeks();
	       
	       if(ch == 'i')
	       {
		       char c = sc.next().charAt(0);
		       obj.insert(clist, c);
	       }
	    
	       if(ch == 'f')
	       {
		        char c = sc.next().charAt(0);
		        obj.freq(clist, c);
	       }
	    }
	    }
	
	}
}
