package vectorAndStack;

import java.util.ArrayList;

public class StackviaArraylist<E> {
	private ArrayList<E> nums=new ArrayList<E>();
	
	void push(E data) {
		nums.add(data);
	}
    E pop() throws Exception{
    	if(nums.isEmpty()) {
    		throw new Exception("ILLEGAL POPPING  DATA FROM EMPTY STACK");
    		}
E temp=nums.get(nums.size()-1);
nums.remove(nums.size()-1);
    	return temp;
    			}
    E peek() throws Exception{
    	if(nums.isEmpty()) {
    		throw new Exception("ILLEGAL POPPING  DATA FROM EMPTY STACK");
    		}
    	return nums.get(nums.size()-1);

    			}
}
