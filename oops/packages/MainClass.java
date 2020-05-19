package oops.packages;
import oops.packages.models.Student;
public class MainClass {

	public static void main(String[] args) {
	Student obj=new Student(7,568,"mehul");
	System.out.println(obj.roll);
	System.out.println(obj.phone);
	int c=obj.getpass(obj.roll, obj.phone);
	System.out.println(c);
	}

}
