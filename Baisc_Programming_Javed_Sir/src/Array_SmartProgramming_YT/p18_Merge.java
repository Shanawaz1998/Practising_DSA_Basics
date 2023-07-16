package Array_SmartProgramming_YT;

public class p18_Merge {
	public static void main(String[] args) {
		int a []= {1,2,3};
		int b []= {4,5,6,7,8,9,0};
		int a_len = a.length;
		int b_len = b.length;
		int c_len = a_len + b_len;
		int k = 0;
		int c [] = new int [c_len];
		
		for(int i = 0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		for(int j = 0;j<b.length;j++)
		{
			c[a.length+j] = b[j];
		} 			
		for(int x : c)
		{
			System.out.println(x);
		}
	}
}
