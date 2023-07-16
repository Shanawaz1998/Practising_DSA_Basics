//to multiply all the odd number in the range 1 to 10
public class P5 {

	public static void main(String[] args)
	{
		int mul = 1;
		for (int i=1;i<=10;i++ )
		{
			if(i%2==1)
			{
				mul = mul * i;	
			}
		}System.out.println(mul);
	}


}
