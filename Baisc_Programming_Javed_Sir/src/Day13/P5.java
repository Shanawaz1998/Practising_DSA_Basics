package Day13;

public class P5 {

	public static void main(String[] args) {
		char c = 'A';
		for(int i = 1;i<=5;i++)
		{
			for(int j = 1;j<=5;j++)
			{
				if(i+j <= 6)
				{
					System.out.print( " * ");
					
				}
				else
				{
					System.out.print(
							"  ");
				}
			}
			System.out.println();
		}
	}

}
/*
int n = 5;
for(int i = n;i>=1;i--)
{
	for(int j = 1; j<=n;j++)
	{
		System.out.print("* ");
	}
	n--;
	System.out.println();
}
*/	