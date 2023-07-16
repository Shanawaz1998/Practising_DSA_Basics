package Day_3;
//Decimal to octal
public class P5 {

	public static void main(String[] args) {
		int n = 12;
		String oct = "";
		while(n!=0)
		{
			int r = n%8;
			oct = r + oct;
			n = n/8;
		}
		System.out.println(oct);
	}

}
