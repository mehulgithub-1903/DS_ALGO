package MergeOverlap;
import java.util.*;
public class MainClass {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T>0) {
	T--;
		int a,b;
		int N;
		N=sc.nextInt();
		ArrayList<Interval> intervals=new ArrayList<Interval>();
		for(int i =0;i<N;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
		intervals.add(i, new Interval(a,b));
	}
		
		merge(intervals);
		System.out.print("\n");
		for(Interval in:intervals) {
			System.out.print(in);
			System.out.print(" ");
		}
		System.out.println("\n");
	}
	}
	public static ArrayList<Interval> merge(ArrayList<Interval> name) {
		        int i=0;
		        int j=1;
		       int count=0;
		  while(count!=name.size()) {
			  if((name.get(i).end<name.get(j).start)||(name.get(i).start>name.get(j).end)) {
				  name.add(name.get(j));
				  name.remove(j);
				 j--;
			  }else {
				  name.get(i).start=Math.min(name.get(i).start,name.get(j).start);
				  name.get(i).end=Math.max(name.get(i).end,name.get(j).end);
				  name.remove(j);
				  count++;
				  }
		  }
		return name;
}
}