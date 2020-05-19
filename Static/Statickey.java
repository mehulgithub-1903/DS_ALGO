package Static;

public class Statickey {

	  int count=0;                                                        //if the count beomes static int it will give a output of
	public Statickey() {                                                  //123 beacu
	count++;                                                                //static variable will get the memory only once, if any object changes the value
	                                                                              //of the static variable, it will retain its value.
	System.out.println(count);
	}

	public static void main(String[] args) {
       Statickey s=new Statickey();
       Statickey o=new Statickey();
       Statickey p=new Statickey();

	}

}
