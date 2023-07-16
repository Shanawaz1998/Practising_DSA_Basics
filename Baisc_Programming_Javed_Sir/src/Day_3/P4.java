package Day_3;
//Decimal to Binary
public class P4 {

	public static void main(String[] args) {
		int n = 12;
		String dec = "";
		while(n!=0)
		{
			int r = n%2;
			dec = r +dec;
			n = n/2;
		}
		System.out.println(dec);
	}

}
