package NumberSystem;

import java.util.Scanner;

public class DecToHex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int n = sc.nextInt();
		char a [] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String dec = "";
		while (n!=0)
		{
			int r = n%16;
			dec = a[r] + dec ;
			n = n/16;
		}
		System.out.println(dec);
	
}
}
