package geeksforgeeks;
import java.util.*;
public class ReverseArrayInGroups {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
		int n=sc.nextInt();
		int k=sc.nextInt();
	    ArrayList<Integer> a=new ArrayList<>();
	    
		for(int i =0;i<n;i++) {
	    	a.add(sc.nextInt());
	    }
        

	System.out.println(reverseInGroups(a, n, k));

	}
	public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> al, int n, int k) {
	if(k>n) {
		k=n;
	}
		List<Integer> ll =new LinkedList<>(al);
		for(int i=0;i<n/k;i++) {
			int ptr=k-1;
			while(ptr>=0) {
				ll.add(ll.get(ptr));
				ll.remove(ptr);
				--ptr;
			}
		}
		if(n%k!=0) {
			int ptr=k-2;
			while(ptr>=0) {
				ll.add(ll.get(ptr));
				ll.remove(ptr);
				--ptr;
		}
		}
		
			ArrayList<Integer> result =new ArrayList<>(ll);
		return  result;
	}
	
static void swap(ArrayList<Integer> a,int i ,int j) {
	int temp;
	temp=a.get(i);
	a.set(i, a.get(j));
	a.set(j, temp);
}
}
