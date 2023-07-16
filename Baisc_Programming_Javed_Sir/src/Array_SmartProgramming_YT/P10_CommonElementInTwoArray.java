package Array_SmartProgramming_YT;
import java.util.*;
public class P10_CommonElementInTwoArray {	
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,3,3,3};
		int b [] = {6,7,8,3,1,9,2,3,3,4,3,3};
		HashSet<Integer> s = new HashSet();      
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<b.length;j++)
			{
				if(a[i] == b[j])
				{
					s.add(a[i]);
					break;
				}
			}
		} 
		System.out.println(s);
		for(int x : s)
		{
			System.out.println(x);
		}
	}
}
