 package Day_3;
//Strong number without method
public class P1_1 {
	public static void main(String[] args) {
		int n = 145;
		int temp =  n;
		int sum = 0;
		while (n!=0)
		{
			int d = n%10;
			int fac = 1;
			for (int i =1;i <=d;i++)
			{
				fac = fac * i;
			}
			sum = sum + fac;
			n= n/10;
		}
		if (temp==sum)
		{
			System.out.println("Strong Number");
		}
		else 
		{
			System.out.println(" Not Strong number");
		}
	}
	
}
