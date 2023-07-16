package DSA_KunalKushwaha;

import java.util.Scanner;

public class MaxNum {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int max = Integer.max(a, b);
//		System.out.println(max);
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = b;
		if(a > b)
		{
			max = a;
		}
		System.out.println("The maximum number is "+max);
	}
	
}
