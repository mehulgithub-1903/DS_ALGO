package Maps;

import java.util.*;
import java.util.Map.Entry;

public class mainClass {

	public static void main(String[] args) {
		Map<String,Integer> numbers=new HashMap<>();
numbers.put("one",1);
numbers.put("two",2);
numbers.put("mehul", 5);
numbers.put("hello",7);
numbers.put("one", 789);
numbers.putIfAbsent("two", 5);
System.out.println(numbers.entrySet());
System.out.println(numbers.keySet());
System.out.println(numbers.values());

//for(Entry<String,Integer> entry:numbers.entrySet()) {
//entry.setValue(entry.getValue()*18);	
//}
//OR YOU CAN MAKE A SET OF ENTRIES
Set<Entry<String,Integer>> entries=numbers.entrySet();
for(Entry<String,Integer>entry:entries) {
	entry.setValue(entry.getValue()*18);
}
System.out.println(numbers);
}
}