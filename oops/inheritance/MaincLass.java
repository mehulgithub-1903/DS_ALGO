package oops.inheritance;

import java.util.Scanner;

public class MaincLass {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		Teacher t=new Teacher();
		t.name="Rohan Kumar";
		t.id=sc.nextInt();
		t.age=sc.nextInt();
		t.Portal();
	t.setSalary(15468);
	System.out.println(t.getSalary());
	System.out.println(t instanceof School);
		Student s=new Student();
		s.id=8657;
		s.age=19;
		s.fees=78965;
		s.Portal();
			}

}
