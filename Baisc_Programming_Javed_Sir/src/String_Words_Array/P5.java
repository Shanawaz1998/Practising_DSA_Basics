package String_Words_Array;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

//WAP to count the no. of occurence
public class P5 {
	public static void main(String[] args) {
		String s = "shanawaz";
		char a[] = s.toCharArray();
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character,Integer>();
		
		for(int i = 0;i<a.length;i++)
		{
			if(m.containsKey(a[i]) == false)
			{
				m.put(a[i],1);
			}
			else
			{
				int count = m.get(a[i]);
				count = count + 1;
				m.put(a[i],count);
			}
		}
		System.out.println(m);
		
		for(Character x : m.keySet())
		{
			if(m.get(x)>1)
			{
				System.out.println(x);
			}
		}
	}
}
//
//public static void main(String[] args) {
//	String s = "Maharashtra";
//	char [] c = s.toCharArray();   //To convert String to Array using method
//	boolean [] b = new boolean[c.length];   //To make boolean array of the String size when we know the size
//	for(int i =0;i<b.length;i++)	//can be b.length or c.length is one an the same
//	{
//		if(b[i]==false) //default value as false of boolean
//		{
//			int count = 1;
//			for(int j = i+1;j<c.length;j++) 	//can be b.length or c.length is one an the same
//			{
//				if(c[i] == c[j])
//				{
//					count++;
//					b[j] = true;	//To specify that character is counted
//				}
//			}
//			System.out.println(c[i] + " " +count);
//		}
//	}
//}
//2nd Method



