package Array_SmartProgramming_YT;

import java.util.*;

public class P17_RemoveDuplicateHashSet {
	public static void main(String[] args) {
		int a[] = {1,2,4,4,6,7,6,1};
		HashSet<Integer> s = new HashSet();
		
		for(int i = 0;i<a.length;i++)
		{
			s.add(a[i]);
		}
		System.out.println(s);
	}
}
