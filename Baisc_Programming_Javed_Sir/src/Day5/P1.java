package Day5;

public class P1 {

		public static void main(String[] args) {
			int n = 1010;
			int sum = 0;
			int k = 0;
			while(n!=0)
			{
				int d = n%10;
				sum = sum + d*power(2,k++);
				n = n/10;
			}
			System.out.println(sum);
		}
		public static int power(int n,int p) {
		int res = 1;
		for ( int i = 1;i<=p;i++)
		{
			res = res * n;
		}
		return res;
	}
}
