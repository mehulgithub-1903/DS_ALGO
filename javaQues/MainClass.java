package javaQues;

public class MainClass extends date{

	public static void main(String[] args) {
		date d1=new date(6 , 23, 1997);
		date d2=new date(8 ,15,1985);
	date res =	AddedDate(d1, d2);
	String path = System.getProperty("user.dir");
    
    System.out.println("Working Directory = " + path);

		System.out.println(res);
		
//		complexNum c1=new complexNum(5, 6);
//		complexNum c2=new complexNum(10, 16);
//		System.out.println("Sum of "+c1+" and "+c2+" is " +sum(c1, c2));
//		

	}
public static complexNum sum(complexNum obj1,complexNum obj2) {
	complexNum obj3=new complexNum(obj1.real+obj2.real,obj1.complex+obj2.complex);
	
	return obj3;
	
}
}
