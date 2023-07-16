//Assignment - product of all even number
public class P15 {
	public static void main(String[] args) {
		int pro = 1;
		for (int i = 25; i<=35;i++)
		{
			if(i%2==0)
			{
				pro = pro *i;
			}
		}
		System.out.println(pro);
	}
	
}
