package oops.inheritance;

public class Student extends School {
 int fees;
int clas;
public void Portal() {
	System.out.print("Portal pass for student with id:"+id+" is ");
  super .Portal();
}
}
