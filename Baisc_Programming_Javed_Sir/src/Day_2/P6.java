package Day_2;
//special number inn range
public class P6 {

	public static void main(String[] args) 
	{
		for (int i=1;i<=100;i++)
		{
			int n = i;
			int sum = 0;
			int pro = 1;
			int temp = n;
			while (n!=0)
			{
				int d = n%10;
				sum = sum + d;
				pro = pro * d;
				n= n/10;
			}
			int res = sum + pro;
			if(res == temp) {
				System.out.println(temp);	
			}			
		}
		}
	}

