package NumberSystem;
//BIN to dec to HEX
public class BinToHex {
	public static void main(String[] args) {	
		int n = 11111111;
		int dec = BTD(n);
		System.out.println(DTH(dec));
	}
	public static String DTH(int n)
	{
		String dec = "";
		char a [] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(n!=0)
		{
			int d = n%16;
			dec = a[d] + dec;
			n = n/16;
		}
		return dec;
	}
	public static int BTD(int n)
	{
		int k = 0;
		int sum = 0;
		while(n!=0)
		{
			int d = n%10;
			sum = sum + d*power(2,k++);
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
}
