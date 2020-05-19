// DEATH AND BIRTH ARE THE ONLY IMMORTALS!
package queue;

import lists.LinkedList.Node;

public class Myqueue<E> {
   private Node<E> head,rear;

public void Enqueue(E e) {
	Node<E> toAdd=new Node<E>(e);
	if(head==null) {
		head=rear=toAdd;
		return;	
	} 
		rear.next=toAdd;
		rear=rear.next;
	
}
public E Dequeue() {
	if(head==null) {
		return null;
	}
	Node <E> temp=head;
	head=head.next;
	
	if(head==null) {
		rear=null;
	}
	return temp.data;
}
@Override
public String toString() {
	return "Myqueue [head=" + head.data + ", rear=" + rear.data + "]";
}
public void getQue() {
	if(head==null) {
		System.out.println("Firstly,offer something to queue");
	}
	Node<E> temp =head;
	
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
public E element() {
if(head==null) {
	return null;
}
else {
	return head.data;
}
}
}