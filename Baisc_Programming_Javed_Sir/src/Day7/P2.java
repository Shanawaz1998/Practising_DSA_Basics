package Day7;
//Second Way to use Array using new keyword
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of the Array");
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i<a.length;i++)
		{
			System.out.println("Enter the elements");
			a[i] = sc.nextInt();
		}
		for(int i:a)
		{
			System.out.print(i+ " ");
		}
		
	}

}
