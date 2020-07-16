package lists.LinkedList;

 public  class Node<E> {
public 	E data;
	public Node<E> next;
	public Node<E> prev;
//	 Node() {
//		this.data=0;
//		next=null;
//	}
	public Node() {
		this.next=null;
	}
	   public  Node(E data) {
		  this.data=data;
		  this.next=null;
		  this.prev=null;
	  }
	
}
