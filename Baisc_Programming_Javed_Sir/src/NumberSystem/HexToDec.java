package NumberSystem;

import java.util.Scanner;

public class HexToDec {
	public static void main(String[] args) {
		
		String s = "B";
		int dec = 0;
		int k = 0;
		for(int i = s.length()-1;i>=0;i--)
		{
			//Because s.charAt(i) returns ASCII Values
			//for 6 ->  54 - 48 = 6
			//for 0 ->  48 - 48 = 0
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				dec = dec + (s.charAt(i)-48) * pow(16,k++);				
			}	
			
			//for A -> 65 - 55 = 10
			//for D -> 68 - 55 = 13
			else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'F')					
			{
				dec = dec + (s.charAt(i)-55) * pow(16,k++);
			}
		}
		System.out.println(dec);
		
	}
	public static int pow(int n,int p)
	{
		int pro = 1;
		for(int i = 1;i<=p;i++) 
		{
			pro = pro * n;
			
		}
		return pro;	
	}
	
	
}
