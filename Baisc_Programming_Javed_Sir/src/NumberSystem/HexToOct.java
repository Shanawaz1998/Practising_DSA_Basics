package NumberSystem;

public class HexToOct {
	public static void main(String[] args) {
		
		int dec = HTD("B1");
		System.out.println(DTO(dec));		
	}
	public static String DTO(int n)
	{
		String dec = "";
		while(n!=0)
		{
			int d = n % 8;
			dec = d + dec;
			n = n / 8;
		}
		return dec;
	}
	public static int HTD(String s)
	{

		int dec = 0;
		int k = 0;
		for(int i = s.length()-1;i>=0;i--) 
		{
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				dec = dec + (s.charAt(i) - 48)*pow(16,k++);
			}
			else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'F')
			{
				dec = dec + (s.charAt(i) - 55)*pow(16,k++);
			}

		}
		return dec;
	}
	public static int pow(int n, int p)
	{
		int pro = 1;
		for(int i=1;i<=p;i++)
		{
			pro = pro * n;
		}
		return pro;
	}
}
