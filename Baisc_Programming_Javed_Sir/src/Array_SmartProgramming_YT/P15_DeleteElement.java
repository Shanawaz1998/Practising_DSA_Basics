package Array_SmartProgramming_YT;

public class P15_DeleteElement {
	public static void main(String[] args) {
		int a [] = {1,2,30,4,5};
		int del = 30;	
		for(int i = 0;i<a.length;i++)
		{
			if(del == a[i])
			{
				for(int j = i;j<a.length-1;j++) 
				{
					a[j] = a[j+1];	//Left Shifting
				}
				break;      //As After the element gets deleted we no need to traverse the array
			}
		}
		for(int x : a)
		{
			System.out.println(x);
		}
}
}
