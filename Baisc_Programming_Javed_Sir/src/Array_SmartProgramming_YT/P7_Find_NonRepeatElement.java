package Array_SmartProgramming_YT;
//Using XOR
//CONDITION - The missing value should be only single value and other values should appear twice(Not more than Twice)
//And it does not work if the nonElement is 0
import java.util.*;
//Can find only single Non repeat number
public class P7_Find_NonRepeatElement {
	public static void main(String[] args) {
		
		int a [] = {1,2,3,1,2,3,9};
		int res = a[0];
		for(int i = 1;i<a.length;i++)
		{
			res = res ^ a[i];
		}
		System.out.println(res);
		
	}
}

//Explanation
//
//As XOR gives 0 output when two same values are given as input
//And it return 1 when two different values are given as input
