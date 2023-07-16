package Day8;
//Matrix maltiplcation
public class p1 {
public static void main(String[] args) {
	int a [][] = {{1,1,1},
			{1,1,1},
			{1,1,1}};
	int b [][] = {{2,2,2},
			{2,2,2},
			{2,2,2}};

for(int i =0;i<a.length;i++)  		//To select rows
{
	for(int j = 0;j<a.length;j++)		//To select coloumn
	{
		int sum = 0;
		for(int k = 0; k<3;k++) 		//To iterate elements
		{
				sum =  sum + a[i][k] * b[k][j];
			
		}
		System.out.print(sum +" ");
	}
	System.out.println();
}
}
}
