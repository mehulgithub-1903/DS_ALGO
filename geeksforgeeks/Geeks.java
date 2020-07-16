package geeksforgeeks;

import java.util.ArrayList;
import java.util.Collections;

public class Geeks {
	// Function to insert element
    public void insert(ArrayList<Character> clist, char c)
    {
      clist.add(c);
    }
    
    // Function to count frequency of element
    public void freq(ArrayList<Character> clist, char c)
    {
     
        if(clist.contains(c))
        System.out.println(Collections.frequency(clist,c));
        else
        System.out.println("Not Present");
}
}
