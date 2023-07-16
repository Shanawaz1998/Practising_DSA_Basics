package String_SmartProgramming;

public class P7_ReverseString {
	public static void main(String[] args) {
		
		String s = "hello";
		char c [] = s.toCharArray();
		//Using Array
		for(int i = c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		System.out.println();
		//Using Only String
		for(int i = s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//Using reverse() of StringBuffer class
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		//Using reverse() of StringBuilder class
 		StringBuilder sbd = new StringBuilder(s);
		System.out.println(sbd.reverse());		
	}
}
