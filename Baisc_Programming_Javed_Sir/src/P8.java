import java.util.Scanner;
// To find number is prime or composite number
public class P8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
	int n = sc.nextInt();
	if(n==0||n==1)
	{
	System.out.println("not a Prime number");
	return;
	}
	for(int i = 2;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println("Composite number");
			return;
		}		
	}
	System.out.println("prime number");

	}}	


