package oops.inheritance;

public class Teacher extends School{
	private int salary;
    String subject;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    public void Portal() {
    	System.out.print("Portal pass for teacher "+name+" is ");
   super.Portal();   
    }
    
}
