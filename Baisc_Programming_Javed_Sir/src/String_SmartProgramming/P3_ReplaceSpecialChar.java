package String_SmartProgramming;

public class P3_ReplaceSpecialChar {
	public static void main(String[] args) {
		
		String s = "&^$$@#@*&j%aV&^%%#a%^^&%";
		
		String str = (s.replaceAll("[^A-Za-z0,9]", ""));
		System.out.println(str);
		
	}
}


//Second Approach


//public static void main(String[] args) {
//	String s = "&^$$@#@*&j%av&^%%#a%^^&%";
//	String res = "";
//	for(int i = 0;i<s.length();i++)
//	{
//		if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
//		{
//			res = res + s.charAt(i);
//		}
//	}
//	System.out.println(res);
//}
