	package String_SmartProgramming;

public class StringSorting {
	public static void main(String[] args) {
		
		String a [] = {"abc","aa","ac","ad"};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a.length-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)   //compareTo() gives +ve value if the condition is true and -ve if false
											   //And 0 if equals
				{
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(String s : a)
		{
			System.out.println(s);
		}
		
	}
}
