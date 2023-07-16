package DSA_KunalKushwaha;

public class BinarySearch {
	public static void main(String[] args) {
		
		int a[] = {9,8,7,6,5,4,3,2,1};
		int ser = 6;
		int li = 0;
		int hi = a.length-1;
		int mi = (li + hi)/2;
		while(li <= hi)
		{
			if(a[mi] == ser)
			{
				System.out.println("The element is present at "+mi);
				break;
			}
			else if(ser > a[mi])
			{
				hi = mi - 1;
			}
			else if(ser < a[mi])
			{
				li = mi + 1;
			}
			mi = (li + hi)/2;
		}
		if(li > hi)
		{
			System.out.println("The element if not found");
		}
	}
}
