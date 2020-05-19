package oops.packages.models;

public class Student {
  public int roll;
  public int phone;
  String name;
 public Student(int a,int b,String name){
	  roll=a;
	  phone=b;
	  this.name=name;
  }
 public int getpass(int roll,int phone) {
	 return roll*phone;
 }
}
