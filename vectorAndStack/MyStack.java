package vectorAndStack;
import lists.LinkedList.MyLinkedList;


public class MyStack<E> {
 private MyLinkedList<E> ll=new MyLinkedList<>();
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("data cannot be popped from empty stack");
			}
		else {
			return ll.removeLast();
		}
	}
E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception(" cannot be peek in a empty stack");
			}
		else {
		return ll.getLast();
		}
	}
		
	}

