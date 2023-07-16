package Day13;

public class Pyramid {

	public static void main(String[] args) {
	int n = 5;
	int c =1;
	for(int i = 1;i<=n;i++)
	{
		for(int j = 1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j = 1;j<=c;j++)
		{
			System.out.print("*");
		}
		c+=2;
		System.out.println();
	}
	int d = c -2;
	for(int i = n-1;i>=0;i--)
	{
		d = d - 2;
		for(int j = 1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j = 1;j<=d;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
//Another method

//public static void main(String[] args) {
//	int n = 5;
//	for(int i =0;i<5;i++)
//	{
//		for(int j = 1;j<=n-i;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j = 1;j<=(2*i)+1;j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//}
