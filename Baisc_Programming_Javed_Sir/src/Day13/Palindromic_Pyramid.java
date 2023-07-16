package Day13;

public class Palindromic_Pyramid {

	public static void main(String[] args) {
	int n = 5;
	for(int i = 1;i<=n;i++)
	{
		//For Spaces
		for(int j = 1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		//Half Pyramid
		for(int j = i;j>=1;j--)
		{
			System.out.print(j);
		}
		//Remaining Pyramid
		for(int j = 2;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	}

}