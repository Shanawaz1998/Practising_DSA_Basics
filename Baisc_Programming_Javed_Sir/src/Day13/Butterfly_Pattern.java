package Day13;


public class Butterfly_Pattern {

	public static void main(String[] args) {
	int n = 10;
	
		for(int i =1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				if((i>=j && i+j<=n+1) || (i+j>=n+1 && i<=j))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}


/*
public class Butterfly_Pattern {
 public static void main(String[] args) {
	int n = 5;
	
	for(int i = 1;i<=n;i++)
	{
		for(int j = 1;j<=i;j++)
		{
			System.out.print("*");
		}
		int space = 2*(n-i);
		for(int j = 1;j<=space;j++) 
		{
		System.out.print(" ");	
	
		}
		for(int j = 1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i = n;i>=1;i--)
	{
		for(int j = 1;j<=i;j++)
		{
			System.out.print("*");
		}
		int space = 2*(n-i);
		for(int j = 1;j<=space;j++) 
		{
		System.out.print(" ");	
	
		}
		for(int j = 1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
*/