package String_SmartProgramming;

public class P1_ReverseEachLetter {
	public static void main(String[] args) {
		
		String s = "Java Programming";
		String[] st = s.split(" ");
		for(int i = 0;i<st.length;i++)
		{
			String rev = "";
			for(int j = st[i].length()-1;j>=0;j--)
			{
				rev = rev + st[i].charAt(j);
			}
			System.out.print(rev +" ");
		}
		System.out.println();
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
