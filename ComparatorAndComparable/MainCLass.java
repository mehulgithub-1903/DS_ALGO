package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCLass {

	public static void main(String[] args) {
		List<Student> nl=new ArrayList<>();
		nl.add(new Student(78, "Arun", 18));
		nl.add(new Student(89, "Viresh",26));
		nl.add(new Student(12, "Mehul",13));
		nl.add(new Student(78, "Arun",16));
		nl.add(new Student(46, "Tom",19));
		nl.add(new Student(46, "Aisha",10));
// Collections.sort(nl,new Comparator<Student>() {
//	
//	 public int compare(Student o1, Student o2) {
//			if(o1.name.equals(o2.name)) return o1.marks-o2.marks;
//			else return o1.name.compareTo(o2.name);
//				
//		}
//	 
// });
//		Collections.sort(nl, (o1, o2) -> o1.name.compareTo(o2.name));
		
//		Collections.sort(nl,(o1,o2)->{
//				if(o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;
//				} else {
//					return o1.name.compareTo(o2.name);
//				}
//		});
		Collections.sort(nl,Comparator.comparing(Student::getName)
				.thenComparing(Student::getAge).thenComparing(Student::getAge).reversed());
	nl.forEach(System.out::println);
	

	
	

}
}