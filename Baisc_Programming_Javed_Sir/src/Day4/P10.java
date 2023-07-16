package Day4;

public class P10 {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int sum = 0;
		while(n!=0)
		{
			int d = n%10;
			sum = sum + d;
			n = n / 10;
		}
		if(temp % sum == 0)
		{
			System.out.println("Nivan Number");
		}
		else {
			System.out.println("Not a Niven Number");
		}
	}

}
