package Day4; 
//smallest among array
public class P8 {

	public static void main(String[] args) {
		int a[] = {2,34,3,4,1};
		int small = a[0];
		for (int i = 1;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small = a[i];
			}
		}
		System.out.println(small);
	}

}
