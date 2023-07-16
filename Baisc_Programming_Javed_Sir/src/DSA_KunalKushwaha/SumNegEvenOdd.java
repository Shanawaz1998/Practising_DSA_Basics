package DSA_KunalKushwaha;

import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class SumNegEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumNeg = 0;
		int sumEven = 0;
		int sumOdd = 0;
		while(true)
		{
			int n = sc.nextInt();
			if(n == 0)
			{
				break;
			}
			else if(n < 0)
			{
				sumNeg = sumNeg + n;
			}
			else if(n%2 == 0)
			{
				sumEven = sumEven + n;
			}
			else if(n%2 != 0)
			{
				sumOdd = sumOdd + n;
			}
		}
		System.out.println(sumNeg);
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}
}
