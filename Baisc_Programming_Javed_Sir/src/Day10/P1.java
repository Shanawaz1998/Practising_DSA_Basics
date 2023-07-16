package Day10;
//To convert Uppercase to lowercase and vise versa
public class P1 {

	public static void main(String[] args) {
		String s = "JaVa";
		char[] c = s.toCharArray();
		System.out.println("Original array : "+s);
//		String st = s.toLowerCase();
//		System.out.println(st);
		for(int i = 0;i<c.length;i++)
		{
			if(c[i] >= 'A' && c[i] <= 'Z')
			{
				c[i] = (char) (c[i]+32);
			}
			else if(c[i] >= 'a' && c[i] <= 'z')
			{
				c[i] = (char)(c[i]-32);
			}
		}
		for(char x : c)
		{
			System.out.print(x);
		}
		}

}
