package lists.LinkedList;

public class MyDoublyLinkedList<E> {
Node <E> head=null;
public void add(E data) {
	Node <E>nN=new Node<E>(data);
	if(head==null) {
		head=nN;
		return;
	}
		Node<E> temp=head;
	 while(temp.next!=null) {
		 temp=temp.next;
	 }
	 temp.next=nN;
	 nN.prev=temp;
}
public void Rotate(MyDoublyLinkedList<E> myll,int p) {
	while(--p>=0) {
		Node<E> temp=myll.head;
		
		while(temp.next!=null) {
			temp=temp.next;
	}
		temp.next=myll.head;
		myll.head.prev=temp;
		myll.head.next.prev=null;
		myll.head.next=null;
	}
}
void getList() /* prints the list*/ {
	//prints complete list
			  Node<E> temp=head;
			  while(temp!=null) {
				 System.out.println(temp.data);
				 temp=temp.next;
			 }
}
}