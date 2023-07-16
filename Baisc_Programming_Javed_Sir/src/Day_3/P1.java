package Day_3;
//Strong Number or not
//Sum of the factorial of  each digits should be equal to the number
//145 - 1! + 4! + 5! = 1 + 24 + 120 = 145
public class P1 {

	public static void main(String[] args) {
		int n = 145;
		int temp = n;
		int sum = 0;
		while(n!=0)
		{
			int d = n%10;
			sum = sum + factorial(d);
			n = n/10;
		}
		if(temp == sum)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("not a strong number");
		}
	}
		public static int factorial(int n) {
			int fact = 1;
			for(int i =1;i<=n;i++)
			{
				fact = fact * i;
			}
			return fact;
		
		}
}
