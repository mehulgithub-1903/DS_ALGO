package vectorAndStack;

import java.util.Arrays;

public class stackViaArray /*this is a static stack*/ {

	final  int DEFAULT_CAPACITY=5; 
	   int size=DEFAULT_CAPACITY;
	   int top=0;
	 private  int arr[];
	public stackViaArray() {
	arr=new int[size];
	}
	public stackViaArray(int manualCap) {
			size=manualCap;
		arr =new int[size];	
	}
	  
  void push(int e) throws Exception{
	  if(top==size) {
		  throw new Exception("STACK OVERFLOW");
	  }
	  arr[top]=e;
	  top+=1;
	  //if you want to make stack a dynamic one then uncomment the below code
	 /* if(top==size) {
		arr=Arrays.copyOf(arr, 2*size);
		size*=2;
	  }
	  */
	  
  }
  
  int pop() throws Exception{
	  if(top==0) 	{
		  throw new Exception("Illegal to Pop from empty Stack");
	  }
	  top=top-1;
	  return arr[top];
  }
  
  void printStack() throws Exception{
	  if(top==0) {  
	  throw new Exception("Illegal to print empty stack");
	  }
	  for(int i=0 ;i<top;i++) {
	  System.out.println(arr[i]);
  }
  }
//  int pop() throws Exception{
//	  if(index<0) {
//		  throw new Exception("Illegal to pop from empty Stack");
//		  
//	  }else {
//	    
//	       index--;
//		  return arr[index++];
//	  }
//  }
 
}
