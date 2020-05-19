package encapsulations;

public class Student {

private	int age;
	 private String name;
	  
	 public int getAge() {
		 return age;
	 }
public void setAge(int age)
		 { 
          if(age<20) {
			 this.age=age; 
		 }
          else 
        	  System.out.println("fuckoff");
	 }
public String getName() {
	return name;
}
public void setName(String name) {
	if(name.length()<10)
	{this.name = name;
	}else
	{	System.out.println("chotalikh");
}

}
}