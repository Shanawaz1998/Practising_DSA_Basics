//fibonacci series
public class P7 {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	System.out.println(a+" "+b+" ");
	for(int i =1;i<=8;i++)
	{
		int c = a + b;
		System.out.println(c);
		a=b;
		b=c;	
	}
}
}
