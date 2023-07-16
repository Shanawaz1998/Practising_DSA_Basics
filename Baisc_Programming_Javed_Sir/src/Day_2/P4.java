package Day_2;
//perfect number

//When sum of the factors excluding the number is equal to the number (eg, 6 = 1+2+3) 
//perfect number between 1 to 100
public class P4 {

	public static void main(String[] args) {
		for(int n = 1;n<=100;n++) {
			int sum = 0;
			for (int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum = sum + i;
				}
			}
			if(sum == n)
			{
				System.out.println(n);
				
			}
			
		}
	}

}
