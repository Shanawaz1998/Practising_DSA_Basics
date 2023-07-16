package String_SmartProgramming;

import java.util.*;

//WAP to find the longest subString without repitition
public class LongestSubString {
public static void main(String[] args) {
	String s = "abbac";
	char arr [] = s.toCharArray();
	Map<Character,Integer> m = new LinkedHashMap();
	
	for(int i = 0;i<s.length();i++)
	{
		char ch = arr[i];
		if(m.containsKey(ch) == false)
		{
			m.put(ch,i);
		}
		else
		{
			
		}
	}
	System.out.println(m.entrySet());
	
	
}
}
