package Set;

import java.util.HashSet;
import java.util.Set;

public class mainClass {

	public static void main(String[] args) {
		Set<Integer> x=new HashSet<>();
		x.add(789);
		x.add(78979);
		x.add(459);
		Set<Integer> y=new HashSet<Integer>();
		y.add(459);
		y.add(987);
		x.addAll(y);
		x.retainAll(y);
	System.out.println(x);
	}

}
