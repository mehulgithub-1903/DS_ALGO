package lists.LinkedList;

import java.util.*;

//comparing time to process a insertion of a million elements on 0th index in a linked
//list and a arraylist 

public class mainLinkedList {

	public static void main(String[] args) {

		MyLinkedList myll=new MyLinkedList();
		myll.add(15);
		myll.add(48);
		myll.add(89);
		myll.add(78);
		myll.add(56);
		myll.remove(0);
		//myll.set(2,69);
		myll.getList();
		System.out.print(myll.get(2));
		//System.out.println(myll.size());
//		List<Integer> ll=new LinkedList<Integer>();
//	    List<Integer> al=new ArrayList<Integer>();
//	    getTimeDiff(ll);
//	    getTimeDiff(al);
//	    
	}
	 static void getTimeDiff(List<Integer> list) {
		 
		 long start =System.currentTimeMillis();
		 for(int i=0;i<100000;i++) {
			 list.add(0,i);
		 }
		 long end=System.currentTimeMillis();
		 System.out.println(list.getClass().getName()+"-->"+(end-start));
		 
	 }

}
