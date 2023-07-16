package Day13;

public class P6 {
	public static void main(String[] args) {
		char c = 'E';

		for(int i = 1;i<=5;i++)
		{
			for(int j = 1;j<=5;j++)
			{
				if(i <= j)
				{

					System.out.print(c +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			c--;
		}
	}
}
