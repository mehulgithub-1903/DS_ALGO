package HackerRank;
import java.util.*;


public class JavaArraylist {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
ArrayList<ArrayList<Integer>> parent =new ArrayList<>();

	for(int i =0;i<n;i++) {
		ArrayList<Integer> child=new ArrayList<>();
		int sizeOfChild=sc.nextInt();
		for(int j=0;j<sizeOfChild;j++) {
			child.add(sc.nextInt());
		}
parent.add(child);
	}
	int k=sc.nextInt();
	for(int i =0;i<k;i++) {
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(y-1>=parent.get(x-1).size())  {
		System.out.println("ERROR!");
		}else {
		System.out.println(parent.get(x-1).get(y-1));
	
		}
	}

}
}