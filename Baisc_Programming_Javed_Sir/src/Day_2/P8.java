package Day_2;
//ASSSIGNMENT - Product of odd number of digits
public class P8 {

	public static void main(String[] args) {
		int pro = 1;
		int n = 3234;
		while (n!=0)
		{
			int d = n%10;
			if (d%2!=0)
			{
				pro = pro * d;
			}
			n = n/10;
		}
		System.out.println(pro);
	}

}
