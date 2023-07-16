package String_SmartProgramming;

import java.util.*;

public class P4_RemoveDuplicate {
	public static void main(String[] args) {
		
		String s = "aaavvvbbeeeccbbx";
		char a[] = s.toCharArray();
		boolean[] b = new boolean[a.length];
		
		for(int i = 0;i<a.length;i++)
		{
			if(b[i] == false)
			{
				for(int j = i+1;j<a.length;j++)
				{
					if(a[i] == a[j])
					{
						b[i] = true;
					}
				}
			}
			if(b[i] == false)
			{
				System.out.println(a[i]);
			}
		}
				
		String s1 = "programming";
		
		Set<Character> hs = new LinkedHashSet();
		for(int i =0 ;i<s1.length();i++)
		{
			hs.add(s1.charAt(i));
		}
		System.out.println(hs);

	}
}


