package Day6;
//Binary Search alternative Ways - "array.binarysearch(array name,index number);"
public class P2 {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};
		int search = 3;
		int li = 0;
		int hi = a.length-1;
		int mi = (li + hi) / 2;
		while(li <= hi)
		{
			if(search == a[mi])
			{
				System.out.println("The element is present at the index : " +mi);
				break;
			}
			else if(search > a[mi])
			{
				li = mi + 1;
			}
			else if(search < a[mi])
			{
				hi = mi - 1;
			}
		
			mi = (li + hi)/2;
		}
		if(li>hi)
		{
			System.out.println("The element is not found");
		}
	}

}
