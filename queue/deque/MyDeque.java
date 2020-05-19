package queue.deque;

public class MyDeque<E> {
 Node<E> head,tail;
	public void offerFirst(E e) {
						Node<E> newNode=new Node<E>(e); 
						if(head==null){
								head=tail=newNode;
						       return;
							}
						head.next=newNode;
					    newNode.prev=head;
					    head=newNode;
	}
	public void offerLast(E e) {
		Node<E> newNode=new Node<E>(e); 
		if(head==null){
			head=tail=newNode;
	       return;
		}
		tail.prev=newNode;
	    newNode.next=tail;
	    tail=newNode;
		}
	public E pollLast() {
	if(head==null) {
		return null;
	}
						Node<E> toRemove=tail;
						if(head==tail) {
							head=tail=null;
							return toRemove.data;
						}
						tail=tail.next;
						toRemove.next=tail.prev=null;
						return toRemove.data;
}
	public E pollFirst() {
		if(head==null) {
			return null;
		}
						Node<E> toRemove=head;
						if(head==tail) {
							head=tail=null;
							return toRemove.data;
						}
						head=head.prev;
						toRemove.prev=head.next=null;
						return toRemove.data;
}
	public static class Node<E>{
		E data;
		Node<E> next ,prev;
		public Node(E data){
			this.data=data;
			this.next=this.prev=null;
			}
		
	}
}
