package String_Words_Array;
//WAP to remove all the vowels from the name
public class P2 {
public static void main(String[] args) {
	String s = "spiders";
	String res = "";
	for(int i = 0;i<s.length();i++)
	{
		if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u')
		{
			res = res + s.charAt(i);
		}
	}
	System.out.println(res);
}
}
