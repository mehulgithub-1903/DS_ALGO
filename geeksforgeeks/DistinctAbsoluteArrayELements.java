package geeksforgeeks;
import java.util.*;
public class DistinctAbsoluteArrayELements {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	ArrayList<Integer> al=new ArrayList<>();
	al.add(Math.abs(a[0]));
	for(int i=1;i<n;i++){
		if(al.contains(Math.abs(a[i]))) continue;
		else al.add(Math.abs(a[i]));
	}
	 System.out.println(al.size());
 }
 
	}


