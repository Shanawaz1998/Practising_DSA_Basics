package String_SmartProgramming;

public class P5_ReplacingNumberOfOccurence {
public static void main(String[] args) {
//Array element cannot assign values in the s.charAt() thats why we use array a[i]	
	String s = "shanawaz";
	char a [] = s.toCharArray();
	char k = '1';
	
	for(int i = 0;i<a.length;i++)
	{
		if(a[i] == 'a')
		{
			a[i] = k++;
		}
	}
	for(char c : a)
	{
		System.out.print(c);
	}
}
}
