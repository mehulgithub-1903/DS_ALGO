package anagrams;

public class Anagramsm2 {

	public static void main(String[] args) {
	String a="aab";
	String b="abc";
	int al[]=new int[256];
//	int bl[]=new int[256]; can also be solved via one array method
	int flag=0;
	for(char c :a.toCharArray()) {
	int index=(int) c;
	al[index]++;
	 
	}
for (char c:b.toCharArray()) {
	int index =(int) c;
	al[index]--;
}
	
	for(int i=0;i<256;i++) {
	if(al[i]==0)
	{
       flag=1;
	}
	else 
	{	flag=0;
	break;
	}
	}
if(flag==1)
{
	System.out.println("yes");
}
else{
	System.out.println("no");
}
}
}
