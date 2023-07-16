package DSA_KunalKushwaha;

import java.util.Scanner;

// ncr = n! / r!(n -r)!
// npr = n! / (n - r)!
public class CalculatePermutationAndCombination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int diff = n - r;
		int ncr = fact(n)/(fact(r)*fact(diff));
		int npr = fact(n) / fact(diff);
		System.out.println(ncr);
		System.out.println(npr);
	}
	public static int fact(int n)
	{
		int fact = 1;
		for(int i = 1;i<=n;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
}
