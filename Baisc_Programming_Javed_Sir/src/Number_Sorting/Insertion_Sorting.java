package Number_Sorting;
//Distribute it in the sorted and unsorted array
public class Insertion_Sorting {
	public static void main(String[] args) {
		
		int a[] = {5,4,3,2,1};
		for(int i=1;i<a.length;i++)
		{
			int temp = a[i];
			int j = i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1] = a[j]; 			//Right shift
				j--;
			}
			a[j+1] = temp;
		}
		for(int x : a)
		{
			System.out.print(x);
		}
			
	}
	
}
