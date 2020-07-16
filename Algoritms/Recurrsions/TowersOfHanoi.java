package Algoritms.Recurrsions;

import java.util.Stack;

public class TowersOfHanoi {

	public static void main(String[] args) {
		Stack<String> source=new Stack<String>();
		 Stack<String> auxiliary=new Stack<String>();
		Stack<String> destination=new Stack<String>();
		System.out.println(destination);
		source.push("D5");
		source.push("D4");
		source.push("D3");
		source.push("D2");
		source.push("D1");
		System.out.println(source);
switchTowers(source, auxiliary, destination, 5);
System.out.println(destination);
	}
public static void switchTowers(Stack<String> sou,Stack<String> aux,Stack<String> des,int n) {
if(n==1) {
	des.push(sou.pop());
	
		while(!(aux.isEmpty())) {
			des.push(aux.pop());
		}
return;
}
aux.push(sou.pop());
switchTowers(sou, aux, des, n-1);

}
}
