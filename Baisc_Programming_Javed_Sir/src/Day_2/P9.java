package Day_2;
//ASSSIGNMENT - sum of all the digits if the number is a perfect number
public class P9 {

	public static void main(String[] args) {
		int n = 28;
		int sum = 0;
		int sumd = 0;
		for(int i = 1;i<n;i++)
		{
			if(n%i==0) 
			{
			sum = sum + i;
			}
		}
		if(sum == n)
		{
			while (n!=0)
			{
				
				int d = n%10;
				sumd = sumd + d;
				n = n/10;
			}
			System.out.println(sumd);
		}
		else 
		{
			System.out.println("Not a perfect number");
		}
	}
}






