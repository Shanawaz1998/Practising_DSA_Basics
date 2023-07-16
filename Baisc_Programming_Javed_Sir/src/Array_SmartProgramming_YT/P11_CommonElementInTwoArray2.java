
package Array_SmartProgramming_YT;

import java.util.*;
public class P11_CommonElementInTwoArray2 {
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,2};
		int b [] = {6,7,8,1,2};
		HashSet s = new HashSet();
		
		for(int x : a)
		{
			s.add(x);
		}
		for(int y : b)
		{
			if(s.add(y) == false)
			{
				System.out.println(y);
			}
		}
		
		
		
		
	}
}
