package lists.LinkedList;

import java.util.*;

//comparing time to process a insertion of a million elements on 0th index in a linked
//list and a arraylist 

public class mainLinkedList {

	public static <E> void main(String[] args) {
//		LinkedList<Integer> ll1=new LinkedList<>();
//		LinkedList<Integer> ll2=new LinkedList<>();
//		int x=15;
//		ll1.add(1);
//		ll1.add(2);
//		ll1.add(3);
//		ll1.add(4);
//		ll1.add(5);
//		ll1.add(6);
//ll2.add(11);
//ll2.add(12);
//ll2.add(13);
//for(int i=0;i<ll2.size();i++) {
//ll2.set(i,x-ll2.get(i));
//}
//int count=0;
//
//	for(int i=0;i<Math.max(ll1.size(), ll2.size());i++) {
//	if(ll1.size()<=ll2.size()) {
//		if(ll1.contains(ll2.get(i))) count++;
//	}else {
//		if(ll2.contains(ll1.get(i))) count++;	
//	}
//		
//		
//	}
//	
//
//System.out.println(count);

		MyLinkedList<Integer> myll=new MyLinkedList<Integer>();
		
		
		myll.add(15);
		myll.add(48);
		myll.add(89);
		myll.add(78);
		myll.add(56);
		myll.reverse();
		myll.getList();
//		myll.addFirst(99);
//		myll.add(88);
//		myll.getList();;
//		//myll.remove(0);
//	System.out.print(myll.get(4));
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
static int checkForSum(LinkedList<Integer> head1,LinkedList<Integer> head2,int x) {
	Collections.sort(head1);
	Collections.sort(head2);
	int i;
	for(i=0;i<head2.size();i++) {
		head2.set(i, x-head2.get(i));
	}
	int count=0;
	for(i=0;i<Math.min(head1.size(), head2.size());i++) {
		if(head1.get(i)==head2.size()) count++;
	}
	 
	
	return count;
	
}
}
