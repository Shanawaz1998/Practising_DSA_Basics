package Day7;
//Addition of Matrix
public class P7 {
public static void main(String[] args) {
	int a [][] = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	int b [][] = {{1,0,1},
					{2,3,1},
					{1,1,0}};
	for(int i = 0;i<a.length;i++)
	{
		for(int j = 0;j<a.length;j++)
		{
			System.out.print(a[i][j] + b[i][j] +" ");
			
		}
		System.out.println();
	}
}
}
