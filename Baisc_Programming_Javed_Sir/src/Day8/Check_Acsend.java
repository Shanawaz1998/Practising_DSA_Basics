package Day8;

import java.util.Scanner;

public class Check_Acsend {

	public static void main(String[] args) {
	int row = 3;
	int col = 3;
	
	int a [][] = {{1,2,1},{3,4,3},{5,6,5}};
	
	for(int i = 0;i<row;i++)
	{
		for(int j = 0;j<col;j++)
		{
			System.out.print(a[i][j] +" ");
		}
		System.out.println();
	}

	}

}
