package Maps;

import java.util.*;
import java.util.Map.Entry;

public class mainClass {

	public static void main(String[] args) {
		String s="sameena";
		System.out.println(s.hashCode());
//	System.out.println(getHash("AB")%5);
//	Map<String,Integer> numbers=new HashMap<>();
//	numbers.put("Tom",125);
//	numbers.put("Rich",968);
//	numbers.put("Emily",789);
//	numbers.put("Aaron",536);
////numbers.put("Tom",745);
//	numbers.putIfAbsent("two", 5);
//	System.out.println(numbers.get("Emily"));
//	System.out.println(numbers.entrySet());
//	System.out.println(numbers.keySet());
//	System.out.println(numbers.values());
//	
//	for(Entry<String,Integer> entry:numbers.entrySet()) {
//	entry.setValue(entry.getValue()*18);	
//	}
//	OR YOU CAN MAKE A SET OF ENTRIES
//	Set<Entry<String,Integer>> entries=numbers.entrySet();
//	for(Entry<String,Integer>entry:entries) {
//		entry.setValue(entry.getValue()*18);
//	}
//	System.out.println(numbers);
}

	public static int getHash(String s) {
		int hash=0;
		for(int i =0;i<s.length();i++) {
		hash+=s.charAt(i);
	}
		return hash;
		
	}
	
}
