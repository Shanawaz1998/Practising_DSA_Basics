package String_Words_Array;
//Reverse the positions of the words
public class P3 {
	public static void main(String[] args) {
		String s = "Welcome to Qspiders";
		String a[] = s.split(" ");
		String str = "";
		for(int i = a.length-1;i>=0;i--)
		{
			System.out.print(a[i] + " ");
			str = str + a[i];
		}
		System.out.println();
		System.out.println(str);
}
}