package Day4;
//Largest among array
public class P7 {

	public static void main(String[] args) {
		int a[] = {3,5,23,64,33};
		int large = Integer.MIN_VALUE;
		for (int i =1;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large = a[i];
			}
		}
		System.out.println(large);
	}

}
