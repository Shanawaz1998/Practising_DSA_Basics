package Array_SmartProgramming_YT;

//Step 1 - Sort the element
//Step 2 - Print the Element present at the required position
public class P1_Kth_Element {
	public static void main(String[] args) {
		int k =3 ;
		int a[] = {5,4,3,2,1};
		//Sorting
		for(int i = 0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	
			System.out.println(a[k-1]);
		
	}
}
