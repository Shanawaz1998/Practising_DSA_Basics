 package Array_SmartProgramming_YT;

import java.util.HashSet;

//If duplicate elements are present inside the same array
public class P12_CommonElementInTwoArray3 {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,4};
		int b [] = {6,7,8,1,9,9};
		
		HashSet<Integer> s1 = new HashSet();
		HashSet<Integer> s2 = new HashSet();

		for(int x : a)
		{
			s1.add(x);
		}
		for(int y : b)
		{
			s2.add(y);
		}
		for(int z : s2)
		{
			if(s1.add(z) == false)
			{
				System.out.println(z);
			}
		}
	}
}
