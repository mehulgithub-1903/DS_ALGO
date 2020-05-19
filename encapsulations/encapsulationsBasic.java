package encapsulations;
 
class encap{

	    private float comm;
	    private String Name;
	    private int Age;
	  //Getter and Setter methods
		   
		public float getComm() {
			return comm;
		
		}
		public void setComm(float comm) {
			if(comm>5.3)
			System.out.println("commission too high");
			else	
			this.comm = comm;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			this.Name = name;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
		if(age<20)
			Age = age;
		}

	  
}
	
	public class encapsulationsBasic{
	    public static void main(String args[]){
	encap obj = new encap();
	         obj.setName("Mario");
	         obj.setAge(32);
	         obj.setComm(6.25f);
	         System.out.println("Employee Name: " + obj.getName());
	         System.out.println("Employee comm: " + obj.getComm());
	         System.out.println("Employee Age: " + obj.getAge());
	    } 
	}


