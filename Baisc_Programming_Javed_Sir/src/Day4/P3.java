package Day4;
//Product of even array
public class P3 {

	public static void main(String[] args) {
		int a[] = {2,1,3,5,1};
		int pro = 1;
		for (int i = 0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				pro =pro * a[i];
			}
		}
		System.out.println(pro);
	}

}
