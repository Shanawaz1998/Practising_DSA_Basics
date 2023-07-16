package String_Words_Array;

public class P7 {
	public static void main(String[] args) {
		String s = "level";
		String rev = "";
		for(int i = s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(s);
		System.out.println(rev);
		System.out.println(s == rev);
		System.out.println(rev.equals(s));
		if(rev.equals(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
