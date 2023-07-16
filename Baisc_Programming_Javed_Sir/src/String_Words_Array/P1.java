package String_Words_Array;
//WAP to remove all the white spaces
public class P1 {

	public static void main(String[] args) {
		String s ="Welcome to Qsiders";
		String res = "";
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			{
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);
	}

}
