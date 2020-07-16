package lists;

import java.util.*;

import MergeOverlap.Interval;
public class MyArrayList {

	public static void main(String[] args) {
		
LinkedList<Integer> nums =new LinkedList<Integer>();
nums.add(45);
nums.add(78);
System.out.println(nums);
nums.add(98);
System.out.println(nums);
nums.remove(1);
System.out.println(nums);
//	for(int i=0;i<4;i++) {
//		nums.add(new Interval(i,i+3));
//	}
//
//	int j=1;
//	System.out.println(nums.get(j));
//swapInList(j+1, j, nums);
//System.out.println(nums);
//System.out.println(nums.get(j));
	}
 static void swapInList(int i,int j,List<Interval> nums) {
	Interval temp;
	temp=nums.get(i);
    nums.set(i, nums.get(j));
    nums.set(j, temp);
}

}
