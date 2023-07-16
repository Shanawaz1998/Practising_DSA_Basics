package Day13;

public class P12 {
public static void main(String[] args) {
	int n = 5;
	for(int i = n;i>=n;i--)
	{
		for(int j = 1;j<=i;j++)
		{
			System.out.print(j+" ");
			n--;
		}
		
		System.out.println();
	}
}
}
