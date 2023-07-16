package Array_SmartProgramming_YT;

import java.util.*;
//CONDITION - All Arrays should be sorted
public class P13_ThreeArrayCommonElement {
	public static void main(String[] args) {
		
		int a [] = {2,4,8};
		int b [] = {2,3,4,8,10,16};
		int c [] = {2,4,8,14,40};
		
		int x = 0,y=0,z=0;          		//Index Values of arrays
		ArrayList al = new ArrayList();
		
		while(x<a.length && y<b.length && z<c.length)
		{
			if(a[x] == b[y] && b[y] == c[z])
			{
				al.add(a[x]);
				x++;
				y++;
				z++;
			}
			else if(a[x] < b[y])
			{
				x++;
			}
			else if(b[y] < c[z])
			{
				y++;
			}
			else 
			{
				z++;
			}
		}
		System.out.println(al);		
	}
}
