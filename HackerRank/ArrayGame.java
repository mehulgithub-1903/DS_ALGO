package HackerRank;

import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int leap=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println(canWin(leap, a));
	}
	 public static boolean canWin(int leap, int[] game) {
	       boolean win=true;
	        int l=game.length;

	int i=0;
	while(i<l) {
	        if(i+leap>=l) return win;
	        else if(game[i+leap]==0) {
	        	i=i+leap;
	        }
	        else if(i+1<l-1 && game[i+1]==0 &&  game[i+1+leap]==0) {
	        	i=i+1;
	        }else if(i-1>=0 && game[i-1]==0) {
	        	i=i-1;
	        }
	        else {
	        	break;
	        }
	        
	}
	return false;
	    }
}
