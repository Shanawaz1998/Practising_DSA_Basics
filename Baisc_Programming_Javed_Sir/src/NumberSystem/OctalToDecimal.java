package NumberSystem;

public class OctalToDecimal {

	public static void main(String[] args) {
			int sum = 0;
		int n = 16;
		String dec = "";
		int k = 0;
		while(n!=0)
		{
			int d = n % 10;
			sum = sum + d*power(8,k++);
			n = n /10;
		}
		System.out.println(sum);
	}
	public static int power(int n,int p)
	{
		int pow = 1;
		for(int i = 1;i<=p;i++)
		{
			pow = pow * n;
		}
		return pow;
	}

}
