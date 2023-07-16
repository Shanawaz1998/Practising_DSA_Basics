package NumberSystem;

public class OctalToBin {
	public static void main(String[] args) 
	{
		int n = 20;
		int d = OTD(n);
		System.out.println(DTB(d));
	}
	public static int OTD(int n)
	{		
			int sum = 0;
			String dec = "";
			int k = 0;
			while(n!=0)
			{
				int d = n % 10;
				sum = sum + d*power(8,k++);
				n = n /10;
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
		public static String DTB(int n)
		{
			String dec = " ";
			while(n!=0)
			{
				int r = n%2;
				dec =  r + dec;
				n = n/2;
			}
			return dec;
		}
	

	}

