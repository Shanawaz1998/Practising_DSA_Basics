package DSA_KunalKushwaha;
//Order Agnostic binary search is used when we dont know the array is sorted in Ascending or descending order
public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
		int a[] = {9,8,7,6,5,4,3,2,1};
		int target = 7;
		int li = 0;
		int hi = a.length-1;
		int mi = (li + hi)/2;
		
		boolean isAsc = a[li] < a[hi];
		while(li <= hi)
		{
			if(target == a[mi])
			{
				System.out.println("The element is present at the index : "+mi);
				break;
			}
			if(isAsc)
			{
				if(target > a[mi])
				{
					li = mi + 1;
				}
				else 
				{
					hi = mi - 1;
				}
			}
			else
			{
				if(target < a[mi])
				{
					li = mi + 1;
				}
				else 
				{
					hi = mi - 1;
				}
			}
			mi = (li + hi)/2;
		}
		if(li > hi)
		{
			System.out.println("The element is not present");
		}
	}
}
