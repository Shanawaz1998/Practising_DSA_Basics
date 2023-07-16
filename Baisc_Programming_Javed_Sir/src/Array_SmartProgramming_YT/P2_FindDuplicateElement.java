package Array_SmartProgramming_YT;

//Hold one element and compare with all others

//Using Brute Force Method
//Disadvanatages - 
//1. Very Slow it compare all the element with all the other elements
//2. If the element it repeated more that two then it gets printed 2 times

public class P2_FindDuplicateElement {
	public static void main(String[] args) {
		int a []  = {1,2,3,2,5,0,3,1,2};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i] == a[j] & i!=j)
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
