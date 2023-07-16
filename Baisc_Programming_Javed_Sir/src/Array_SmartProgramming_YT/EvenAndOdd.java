package Array_SmartProgramming_YT;

import java.util.*;

public class EvenAndOdd {
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> a1 = new ArrayList();
		ArrayList<Integer> a2 = new ArrayList();
		
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] % 2 == 0)
			{
				a1.add(a[i]);
			}
			else if(a[i] % 2 != 0)
			{
				a2.add(a[i]);
			}
		}
		System.out.println("Even Number");
		for(int x : a1)
		{
			System.out.println(x);
		}
		System.out.println("Odd Number");
		for(int y : a2)
		{
			System.out.println(y);
		}
		
	}
}
