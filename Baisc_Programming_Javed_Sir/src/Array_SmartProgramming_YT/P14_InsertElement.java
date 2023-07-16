package Array_SmartProgramming_YT;

public class P14_InsertElement {
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5};
		int pos = 3;
		int element = 100;
		for(int i = a.length-1;i>pos - 1;i--)
		{
			a[i] =a[i-1];		//Right Shifting
		}
		a[pos-1] = element;
		for(int x : a)
		{
			System.out.println(x);
		}
		
		
	}
}
