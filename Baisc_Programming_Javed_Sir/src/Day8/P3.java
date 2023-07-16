package Day8;
//Reverse the String
public class P3 {
	public static void main(String[] args) {
	String s = "Qspiders";
	String rev = "";
	for(int i = s.length()-1;i>=0;i--)
	{
		rev = rev + s.charAt(i);
	}
	System.out.println(rev);
}

}

//String s = "Qspiders";
//char a [] = s.toCharArray();
//for(int i=0;i<a.length/2;i++)
//{
//	char temp = a[i];
//	a[i] = a[a.length-1-i];
//	a[a.length-1-i] = temp;
//}
//for(char x : a)
//{
//	System.out.print(x);
//}