package anagrams;

public class Anagrams101 {

	public static void main(String[] args) {
//int count=1;
		boolean Anagram=false;
  String str1="dad";
  String str2="add";
  
  boolean visited[]=new boolean[str2.length()];
if(str1.length()==str2.length())
{
	
	for(int i=0;i<str1.length();i++)
	{  Anagram=false;
		char c=str1.charAt(i);
		for(int j=0;j<str2.length();j++)
		{
			if(c==str2.charAt(j) && !visited[j])
		{
			visited[j]=true;//str2.replace(str2.charAt(j),'\0');
			Anagram=true;
			break;
		}
		}
		if(!Anagram)
		{
			break;
		}
	}
	//if(count==str1.length())
	if(Anagram)
	{
		System.out.println("yes anagram");
	}
	else 
	{
		System.out.println("no it is not a anagram");
	}
	
}
else
{
	System.out.println("no it is not a anagram");
}
	}

}
