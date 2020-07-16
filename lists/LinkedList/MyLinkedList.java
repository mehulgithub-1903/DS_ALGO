package lists.LinkedList;

public class MyLinkedList<E>{

	Node <E>head=null;
//	Node tail;
	public  void add(E data) /*adds to end of linked list*/{
		Node<E> newNode = new Node<>(data);
	 
		if(head==null) {
		head=newNode;
		return;
		}
		Node<E> temp=head;
	 while(temp.next!=null) {
		 temp=temp.next;
	 }
	 temp.next=newNode;
	 }	
	public void addFirst(E data){
		Node<E> newNode=new Node<>(data);
		newNode.next=head;
		head=newNode;
	}
	void getList() /* prints the list*/ {
//prints complete list
		  Node<E> temp=head;
		  while(temp!=null) {
			 System.out.println(temp.data);
			 temp=temp.next;
		 }
	 }
     E get(int n) /*gives you nth element*/{
    	 int i =0;
    	 Node<E> temp=head;
    	 while(i<n) {
    		 temp=temp.next;
    		 i++;
    	 }
    	 return (E) temp.data;
     }
     int size() {
    	 Node<E> temp =head;
    	 int i=1;
    	 while(temp.next!=null) {
    		 temp=temp.next;
    		 i++;
    	 }
    	 return i;
     }
     Node<E> getAdd(int n) {
    	
        	 int i =0;
        	 Node<E> temp=head;
        	 while(i<n) {
        		 temp=temp.next;
        		 i++;
        	 }
        	 return temp.next;
     }
     void remove(int n){
    int j=0;
    Node<E> temp=head;
    if(n==0) {
   head=temp.next;
   temp.next=null;
   return;
    }
   
    Node<E> temp1=getAdd(n-1);
    while(j<n) {
    	if(j==n-1) {
    	temp.next=getAdd(n);	
    	}
    	else {
    		temp=temp.next;
    	}
    	j++;
    }
    	temp1.next=null;
  
     }
     void set(int n,E data) {
    	 int i =0;
    	 Node<E> temp=head;
    	 while(i<n) {
    		 temp=temp.next;
    		 i++;
    	 }
    	  temp.data=data;	
}
     public E removeLast() throws Exception{
	Node<E> temp = head;
	if(temp==null) {
		throw new Exception("Cannot remove from empty linkedList");
	}
	if(temp.next==null) {
		Node<E> toRemove =head;
		head=null;
		return toRemove.data;
	}
	while(temp.next.next!=null) {
		temp=temp.next;
	}
	Node<E> toRemove =temp.next;
	temp.next=null;
   return toRemove.data;
}
     public boolean isEmpty() {
	return head==null;
}
     public E getLast() throws Exception{
    		Node<E> temp = head;
    		if(temp==null) {
    			throw new Exception("cannot get last element from empty linkedList");
    		}
    		if(temp.next==null) {
    			return temp.data;
    		}
    		while(temp.next!=null) {
    			temp=temp.next;
    		}
    		return temp.data;
    	}
    
     public void reverse() {
    	 if(head.next==null){
             return;
         }
         Node <E>curr=head.next;
          Node <E>temp=head;
          head.next=null;
  while(temp!=null){
          temp=curr.next;
          curr.next=head;
          head=curr;
          curr=temp;
  }
  
     }
}
	 
