package vectorAndStack;

public class MainClass {

	public static void main(String[] args) throws Exception {
		StackviaArraylist<Integer> myst=new StackviaArraylist<Integer>();
		myst.push(798);
		myst.push(7547);
		myst.push(8789);
		myst.push(72158);
		myst.push(754245);
		myst.push(824);
		myst.push(7982);
		myst.push(7);
		myst.push(3645);
		StackviaArraylist<String> st2=new StackviaArraylist<String>();
	st2.push("rich");
	st2.push("aaron");
	st2.push("emily");
	st2.push("arrow");
	st2.push("Deathstroke");
//	for(int i=0;i<3;i++) {
//		System.out.println(myst.pop()+","+st2.pop());
//	}
	System.out.println(st2.peek()	);
		//   Stack<Integer> myst=new Stack<Integer>();
//   myst.push(3);
//   if(myst.peek()==3) {
//	   System.out.println("jello");
//   }
   
 	}

}
