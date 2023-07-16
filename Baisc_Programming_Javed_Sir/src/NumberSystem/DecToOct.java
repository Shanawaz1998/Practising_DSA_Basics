package NumberSystem;

public class DecToOct {

	public static void main(String[] args) {
		int n = 10;
		String dec = "";
		while(n!=0)
		{
			int r = n %8;
			dec = r + dec;
			n = n/8;
		}
		System.out.println(dec);
	}

}
