package Day13;
//Right angle Triangle or Half Pyramid
public class P1 {

	public static void main(String[] args) {
		for(int i = 1;i<=5;i++)
		{
			for(int j = 1;j<=5;j++)
			{
				if(i >= j)
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}

}

/*
for(int i =1;i<=a;i++) {
	for(int j =1;j<=i;j++)
	{
		System.out.print("* ");
	}
	System.out.println("  ");
	
}
*/