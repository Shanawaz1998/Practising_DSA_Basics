	package NumberSystem;

public class OctalToHex {
public static void main(String[] args) {
	int n = 56;
	int d = OTD(n);
	System.out.println(DTH(d));
	
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
public static String DTH(int n)
{
	char a [] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	String dec = "";
	while (n!=0)
	{
		int r = n%16;
		dec = a[r] + dec;
		n = n/16;
	}
	return dec;
}
}









