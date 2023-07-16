package Array_SmartProgramming_YT;

import java.util.*;

public class P6_Find_FirstDuplicateElement2 {
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,3,4};
		HashSet<Integer> s = new HashSet();
		
		for(int i = 0;i<a.length;i++)
		{
			if(s.add(a[i]) == false)
			{
				System.out.println(a[i]);
				return;
			}		
		}
		System.out.println("No Duplicate");
		
	}
}
