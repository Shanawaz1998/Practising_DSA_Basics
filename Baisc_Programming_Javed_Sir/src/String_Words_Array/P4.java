package String_Words_Array;
//Reverse every letter of the words
public class P4 {

	public static void main(String[] args) {
		String s = "Welcome to Qspiders";
		String a[] = s.split(" ");

		for(int i = 0;i<a.length;i++) 
		{
			String rev = " ";
			for(int j = a[i].length()-1;j>=0;j--)
			{
				rev = rev + a[i].charAt(j);
			}
			System.out.print(rev+" ");
		}	
	}
}
