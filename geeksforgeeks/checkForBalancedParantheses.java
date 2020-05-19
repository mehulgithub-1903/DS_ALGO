package geeksforgeeks;

import java.util.Scanner;
import java.util.Stack;

public class checkForBalancedParantheses {

	public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T>0){
		T--;
	String exp =sc.next();
	Stack<Character> st=new Stack<Character>();
	boolean isBal=true;
	for(int i =0;i<exp.length();i++) {
		char ch=exp.charAt(i);		
		if(ch=='['||ch=='{'||ch=='(') {
			st.push(ch);
		}
		else {
			if(st.isEmpty()) {
				isBal=false;
				break;
			}
			if(ch==']'||ch=='}'||ch==')') {
				if(ch==']'&& st.peek()=='[') {
					st.pop();
					isBal=true;
				continue;
				}
			 if(ch=='}'&& st.peek()=='{') {
					st.pop();
					isBal=true;
				continue;
				}
			 if(ch==')'&& st.peek()=='(') {
					st.pop();
					isBal=true;	
			continue;
				}
		}		}
	}
	
	
	if(isBal) {
		System.out.println("balanced");
		
	}else {
	System.out.println("not balanced");	
	}
	}
	
}
}


