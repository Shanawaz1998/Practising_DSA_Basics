//factorial of all the digits
public class P17 {

	public static void main(String[] args) {
		int n = 12344;
		while(n!=0)
		{
			int d = n%10;
			int fac = 1;
			for (int i = 1;i<=d;i++)
			{
				fac = fac * i;
			}
			n = n /10;
			System.out.println(fac);
		}
	}

}
