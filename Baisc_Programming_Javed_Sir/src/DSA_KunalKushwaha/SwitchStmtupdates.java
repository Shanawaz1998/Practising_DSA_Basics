package DSA_KunalKushwaha;

import java.util.Scanner;

public class SwitchStmtupdates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		switch(no) {
		case 1:{
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		default:{
			System.out.println("Please enter the valid no.");
			break;
		}
		}
	}
}
