package anagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class groupAnagrams {

	public static void main(String[] args) {
      String [] words= {"eat", "enigma", "miagne", "ate", "nat", "bat","add","dad"};
		
   solution sol =new solution();
     System.out.println(sol.groupAnagram(words));		
	}
 static class  solution{
	public List<List<String>> groupAnagram(String[] strs){
		Map<String, List<String>> map=new HashMap<>();
		for(String s:strs) {
				char[] strArray=s.toCharArray();
				Arrays.sort(strArray);
				String sorted =new String(strArray);
				if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<>());	
			}
				map.get(sorted).add(s);
		}
		return new LinkedList<>(map.values());
	}
}
}
