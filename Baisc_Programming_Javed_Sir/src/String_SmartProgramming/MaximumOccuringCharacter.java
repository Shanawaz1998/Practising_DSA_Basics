package String_SmartProgramming;

public class MaximumOccuringCharacter {
	public static void main(String[] args) {
		
		String s = "abbccc";
		int a[] = new int [127];
		for(int i = 0;i<s.length();i++)
		{
			a[s.charAt(i)] = a[s.charAt(i)] + 1;     //a[95] = a[95] + 1;
													 // Initially array will be 0
													//Then it will increase 
		}
		int max = -1;
		char c = ' ';
		for(int i = 0;i<s.length();i++)
		{
			if(a[s.charAt(i)] > max)
			{
				max = a[s.charAt(i)];
				c = s.charAt(i);
			}
		}
		System.out.println(c);
	}
}
