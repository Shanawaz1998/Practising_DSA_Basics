package Interview_Question;

import java.util.Scanner;
//If a number is divisible by 4 but not by 100 then, it is a leap year. Also, if a number is divisible by 4, 100 and 400 then it is a leap year. Otherwise the year is not a leap year.
public class LeapYear
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	if(check(year))
	{
		System.out.println("Leap year");
	}
	else
	{
		System.out.println("Not a Leap Year");
	}
} 
public static boolean check(int n)
{
	boolean chk = false;
	if(n%100==0)
	{
		if(n%400==0)
		{
			chk = true;
		}
	}
	if(n%4==0)
	{
		chk = true;
	}
	return chk;
}
}
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int year = sc.nextInt();
//	
//	if((year%4==0) && year%100!=0 || year%400==0)
//	{
//		System.out.println("Leap year");
//	}
//	else
//	{
//		System.out.println("Not a Leap Year");
//	}
//	
//}



//
