package NumberSystem;

public class BinToOct {

	public static void main(String[] args) {
		int n = 1010;
		int d = BTD(n);
		System.out.println(d);
		System.out.println(DTO(d));;
	}
	public static int BTD(int n)
	{
		int sum = 0;
		int k = 0;
		while(n!=0)
		{
			int d = n%10;
			sum = sum + power(2,k++)*d;
			n = n/10;
		}
	return sum;
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
	public static String DTO(int n)
	{
		String dec = "";
		int res = 1;
		while(n!=0)
		{
			int d = n%8;
			dec = d + dec;
			n = n/8;
			
		}
		return dec;
	}

}





