package Day8;
//You are given a list of n-1 and their integer are in the range of 1 to n.There are no duplicates one of the integer is missing,
//find the efficient code to find the missing no. 
//i/p - 1,2,4,6,3,7,8
//o/p - 5 
public class P2 { 
	public static void main(String[] args) {
		int a[] = {1,2,4,6,3,7,8};
		int n = a.length+1;    //As 1 is added because their is one missing no. which incompletes the array
		int sumAll = (n*(n+1))/2;
		int sum = 0;
			for(int i =0;i<a.length;i++)
			{
				sum = sum + a[i];
			}
		System.out.println(sumAll - sum);
		}
}
