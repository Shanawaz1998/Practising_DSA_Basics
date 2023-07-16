package Array_SmartProgramming_YT;

public class P8_MissingNum {
	public static void main(String[] args) {
		
		int a[] = {1,2,4,5};
		int n = a.length + 1;
		int sumAll = n*(n+1)/2;
		int sum = 0;
		for(int i = 0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sumAll - sum);
	}
}
