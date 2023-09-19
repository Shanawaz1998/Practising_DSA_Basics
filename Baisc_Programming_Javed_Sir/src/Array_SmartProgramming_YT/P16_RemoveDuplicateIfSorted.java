package Array_SmartProgramming_YT;
//For sorted Array	
public class P16_RemoveDuplicateIfSorted {

		public static void main(String[] args) {
			
			int a [] = {1,2,2,3,4,4,5,5};
			int temp[] = new int [a.length];
			int j = 0;
			for(int i= 0;i<a.length-1;i++)     //-1 is put as in the first line of if block it wants a[i+1] and that will give the indexArrayOutOfBound Exception
			{
				if(a[i] != a[i+1])
				{
					temp[j++]= a[i];
				}
			}
			temp[j] = a[a.length-1];	//To Enter the last Element in the temp Array because we have used -1 in the for loop
			for(int x : temp)
			{
				System.out.println(x);
			}
		}
}
