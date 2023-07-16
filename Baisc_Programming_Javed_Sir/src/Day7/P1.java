package Day7;
//Insertion Sorting
public class P1 {

	public static void main(String[] args) {

		int a[] = {3,2,4,5,1};
		for(int i = 1;i<a.length;i++)
		{
			int temp = a[i];
			int j = i;
			while(j>0 && a[j-1]>temp)
			{
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;			
		}
		for(int i : a)
		{
			System.out.print(i+ "");
		}
}
}
