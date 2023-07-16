package DSA_KunalKushwaha;
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class AddTillX {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = null;
	int sum = 0;
	while(true)
	{
		a = sc.next();
		if(a.equals("x"))
		{
			break;
		}
		int n = Integer.parseInt(a);
		sum = sum + n;
	}
	System.out.println("The result is : "+sum);
}
}
