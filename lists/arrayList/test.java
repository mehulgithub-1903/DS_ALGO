package lists.arrayList;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
	
	ArrayList<Integer> roll=new ArrayList<Integer>();
	roll.add(5);
	roll.add(6);
	int temp=roll.get(1);
	roll.set(1, roll.get(0));
roll.set(0, temp);
			System.out.println(roll.get(0)+","+roll.get(1));
	}

}
