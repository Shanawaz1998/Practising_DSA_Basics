package Array_SmartProgramming_YT;

import java.util.*;
//Disadvantage -
//If the element it repeated more that two then it gets printed 2 times
public class P3_FintDupliateElement_HashMethod {
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,2,3,4,6,4};
		
		Set<Integer> s = new HashSet();
		
//		for(int x : a)
//		{
//			if(s.add(x) ==false)
//			{
//				System.out.println(x);
//			}
//		}
		for(int i = 0;i<a.length;i++)
		{
			if(s.add(a[i]) == false)
			{
				System.out.println(a[i]);
			}
		}

	}
}
