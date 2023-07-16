package Array_SmartProgramming_YT;

public class MatrixMaltiplication {
	public static void main(String[] args) {
		int a[][] = {{1,2},{3,4},{5,6}};
		int b[][] = {{1,2,3},{4,5,6}};
		for(int i = 0;i<a.length;i++)	//3
		{
			for(int j = 0;j<a.length;j++)   //3
			{	
				int sum = 0;
				for(int k = 0;k<b.length;k++)	//2
				{
					sum = sum + (a[i][k]*b[k][j]);	
				}
				System.out.print(sum +" ");
			}
			
			System.out.println();
		}
		
				
		}
}
