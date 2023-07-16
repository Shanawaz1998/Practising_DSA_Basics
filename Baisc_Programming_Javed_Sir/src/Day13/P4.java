package Day13;

public class P4 {
public static void main(String[] args) {
	for(int i = 1;i<=5;i++)
	{
		for(int j = 1;j<=5;j++)
		{
			if(i >= j)
			{
				System.out.print(j);
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
int n = 5;
for(int i = 1;i<=n;i++)
{
	for(int j = 1;j<=i;j++)
	{
		System.out.print(j);
	}
	System.out.println();
}
*/