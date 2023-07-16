package DSA_KunalKushwaha;

import java.util.Scanner;

public class SwitchStmtupdates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
//		switch(no) {
//		case 1:{
//			System.out.println("Monday");
//			break;
//		}
//		case 2: {
//			System.out.println("Tuesday");
//			break;
//		}
//		case 3: {
//			System.out.println("Wednesday");
//			break;
//		}
//		default:{
//			System.out.println("Please enter the valid no.");
//			break;
//		}
//		}

//		switch(no){
//			case 1 -> System.out.println("Monday");
//			case 2 -> System.out.println("Tuesday");
//			case 3 -> System.out.println("Wednesday");
//			case 4 -> System.out.println("Thursday");
//			case 5 -> System.out.println("Friday");
//			case 6 -> System.out.println("Saturday");
//			case 7 -> System.out.println("Sunday");
//			default -> System.out.println("Please enter the valid no.");
//		}

		//To Identify the WeekDays and WeekEnds
		switch(no){
			case 1, 2, 3, 4, 5 -> System.out.println("WeekDays");
			case 6,7 -> System.out.println("WeekEnds");
			default -> System.out.println("please enter the valid no.");
		}
	}
}
