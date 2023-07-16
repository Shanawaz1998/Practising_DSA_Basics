package Interview_Question;

public class Histogram {
	public static void main(String[] args) {
		int a [] = {10,4,7};
		for(int i =0;i<a.length;i++)
		{
			for(int j = 1;j<=a[i];j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
