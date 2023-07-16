//seperate the digits
public class P11 {

	public static void main(String[] args) {
		int n =12334;
		while (n!=0)
		{
			int d = n%10;
			System.out.print(d+" ");
			n=n/10;
		}
	}

}
