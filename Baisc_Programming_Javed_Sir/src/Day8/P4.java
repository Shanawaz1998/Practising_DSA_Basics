package Day8;
//Palindrome
public class P4 {

	public static void main(String[] args) {
		String s = "level";
		String rev = "";
		for(int i = s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
