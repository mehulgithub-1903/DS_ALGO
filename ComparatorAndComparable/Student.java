package ComparatorAndComparable;

public class Student  {
 
	int marks,age;
	String name;

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + ", age=" + age +"]";
	}
	

	public Student(int marks, String name, int age) {
		super();
		this.marks = marks;
		this.name = name;
		this.age = age;
	}




	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Student st) {
	if(st.marks==this.marks) return this.name.compareTo(st.name);
		//if you want to sort in increasing order
		//return this.marks-st.marks; 
		//if you want to sort in decreasing order
		
		return st.marks-this.marks;
		
/*	or you can do
 * if(st.marks>this.marks) return 1;
		else if(st.marks<this.marks) return -1;
		return name.compareTo(st.name);
	*/
	}
	
	

	}


