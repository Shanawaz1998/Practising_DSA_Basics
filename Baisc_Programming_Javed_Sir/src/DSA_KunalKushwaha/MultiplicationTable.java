package DSA_KunalKushwaha;

import java.util.Scanner;
//16/11/2022 : Q) Take a number as input and print the multiplication table for it.
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to get the Multiplication table ");
		int n = sc.nextInt();
		for(int i =1;i<=10;i++)
		{
			System.out.println(n +" X "+ i +" = "+ n*i);
		}
		
	}
}
