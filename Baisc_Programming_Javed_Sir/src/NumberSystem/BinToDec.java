package NumberSystem;

public class BinToDec {
	public static void main(String[] args) {
		int n = 1011;
		int sum = 0;
		int k = 0;

		while(n!=0)
		{
			int d = n%10;
			sum = sum + power(2,k++)*d;
			n = n/10;
		}
		System.out.println(sum);	
	}
	public static int power(int n,int p)
	{
		int pro = 1;
		for(int i = 1;i<=p;i++)
		{
			pro = pro * n;
		}
		return pro;
	}
}
