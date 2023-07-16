package Interview_Question;

public class CallingHistogram {
//	public static void main(String[] args) {
//		printHistogram(new int [] {5,10,7});
//	}
//	public static void printHistogram(int a[])
//	{
//		for(int x : a)
//		{
//			for(int i = 1;i<=x;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//	}
	
	public static void main(String[] args) {
		int a[] = {3,6,1};
		for(int i = 0;i<a.length;i++)
		{
			int n = a[i];
			for(int j = 1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
