package Day_3;
//ArmStrong number : 
public class P3 {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int sum = 0;
		int count = countDigit(n);
		while(n!=0)
		{
			int d = n%10;
			sum = sum + power(d,count);
			n = n /10;
		}
		if(temp == sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstron number");
		}
	}
	public static int countDigit(int n)
	{
		int count = 0;
		while(n!=0)
		{
			n = n/10;
			count++;
		}
		return count;
	}
	public static int power (int n,int p)
	{
		int res = 1;
		for(int i=1;i<=p;i++)
		{
			res =res * n;
		}
		return res;
	}

}
