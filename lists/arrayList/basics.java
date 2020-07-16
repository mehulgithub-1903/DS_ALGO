package lists.arrayList;
import java.util.*;
public class basics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/* Creating ArrayList of type "String" which means
	       * we can only add "String" elements
	       */
	      ArrayList<String> obj = new ArrayList<String>();
//for(int i =0;i<5;i++) {
//    obj.add(i,sc.next());
//}
	      /*This is how we add elements to an ArrayList*/
	      obj.add("Ajeet");
	      obj.add("Harry");
	      obj.add("Chaitanya");
	      obj.add("Steve");
	      obj.add("Anuj");
	      System.out.println(obj);
	      obj.add(obj.get(0));
	      System.out.println(obj);
	      obj.remove(0);
	      System.out.println(obj);
Collections.sort(obj,Collections.reverseOrder());
	      // Displaying elements
	      System.out.println("Original ArrayList:");
	      for(String str:obj)
	         System.out.println(str);

	      /* Add element at the given index
	       * obj.add(0, "Rahul") - Adding element "Rahul" at first position
	       * obj.add(1, "Justin") - Adding element "Justin" at second position
	       */
	      obj.add(0, "Rahul");
	      obj.add(1, "Justin");

	      // Displaying elements
	      System.out.println("ArrayList after add operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove elements from ArrayList like this
	      obj.remove("Chaitanya"); //Removes "Chaitanya" from ArrayList
	      obj.remove("Harry"); //Removes "Harry" from ArrayList

	      // Displaying elements
	      System.out.println("ArrayList after remove operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove element from the specified index
	      obj.remove(1); //Removes Second element from the List

	      // Displaying elements
	      System.out.println("Final ArrayList:");
	      for(String str:obj)
	         System.out.println(str);
	      // to convert arraylist in array
	      ArrayList<String> al=new ArrayList<>();
	      al.add("apple");
	      al.add("red");
	      al.add("dog");
	      Object clonelist;
	      clonelist=al.clone();
	      System.out.println(clonelist);
String [] arr =new String[al.size()];
	      al.toArray(arr);
	      System.out.println(arr[1]);
//to convert array into arraylist
	      String [] a=new String[2];
	      a[0]="hello";
	      a[1]="hell";
	      List<String> bl=new ArrayList<String>(Arrays.asList(a));
	  System.out.println(bl);
	 
/*
 * Note: toString() converts the whole array list into a single String.
 */
	}

}
