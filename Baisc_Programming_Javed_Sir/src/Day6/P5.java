package Day6;
//WAP to display Third largest element without using any sorting technique
public class P5 {
public static void main(String[] args) {
	int a [] = {1,2,3,4,5};
	int large = Integer.MIN_VALUE;
	int slarge = Integer.MIN_VALUE;
	int tlarge = Integer.MIN_VALUE;
	for(int i = 0;i<a.length;i++)
	{
		if(a[i]>large)
		{
			tlarge = slarge;
			slarge = large;
			large = a[i];
		}
		else if(a[i] > slarge && a[i]!=large)
		{
			slarge = a[i];
		}
		else if (a[i] > tlarge && a[i]!=large && a[i]!=slarge)
		{
			tlarge = a[i];
		}
	}
	System.out.println("Largest element : " +large);
	System.out.println("Second Largest element : " +slarge);
	System.out.println("Third Largest element : " +tlarge);
}
}
