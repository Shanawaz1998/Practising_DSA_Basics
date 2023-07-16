package Day12;
//S
public class Patter7 {

	public static void main(String[] args) {
		for(int i =1;i<=5;i++)
		{
			for(int j = 1;j<=5;j++)
			{
				if(i == 1 || i == 5 || i == 3 || i + j == 3 || i + j == 9) //or (j==1 && i<=3) || (j == 5 && i )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
	}

}
