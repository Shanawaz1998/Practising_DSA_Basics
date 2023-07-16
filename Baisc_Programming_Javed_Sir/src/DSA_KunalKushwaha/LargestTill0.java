package DSA_KunalKushwaha;

import java.util.Scanner;
// Q) Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestTill0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		while(true)
		{
			int n = sc.nextInt();
			if(n == 0)
			{
				break;
			}
			if(n > max)
			{
				max = n;
			}
		}
		System.out.println("The largest number is : "+max);
	}
}
