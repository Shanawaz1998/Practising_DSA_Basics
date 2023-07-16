//addition of odd digits      
public class P13 {

	public static void main(String[] args) {
		int n =12333;
		int sum = 0;
		while (n!=0)
		{
			int d = n%10;
			if(d%2!=0)
			{
				sum = sum + d;
			}
			n=n/10;
		}
		System.out.println(sum);
	}

}
