package anagrams;
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
			for(int i =1;i<=t;i++){
		    int n=sc.nextInt();
		    int e=0;
		    int o=0;
		    for(i=1;i<=n;i++){
		        if(i%2==0)
		        {
		            e=e+i;
		        }
		        if(i%2!=0)
		        {
		            o=o+i;
		        }
		        
		    }
		    System.out.println(e);
		    System.out.println(o);
		    
		}
	}
}