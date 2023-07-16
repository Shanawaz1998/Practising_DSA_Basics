package String_SmartProgramming;
import java.util.*;
public class P8_SortingString {
		public static void main(String[] args) {
			String s = "dcba";
			char c [] = s.toCharArray();
			
			for(int i = 0;i<s.length();i++)
			{
				for(int j = i+1;j<s.length();j++)
				{
					if(c[i] > c[j])
					{
						char temp = c[i];
						c[i] = c[j];		//We cannot use s.charAt (Because it is not a variable it returns only boolean values)
						c[j] = temp;
					}
				}
			}
			for(char x : c)
			{
				System.out.print (x);
			}						
		}
}