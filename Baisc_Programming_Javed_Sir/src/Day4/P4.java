package Day4;
//Reverse the array
public class P4 {

	public static void main(String[] args) {
		 int a[] = {1,2,3,4,5};
		 for (int i =0;i<a.length/2;i++)
		 {
			 int temp = a[i];
			 a[i] = a[a.length-1-i];        //As i is increasing from left side in for loop(i++) but we have to also decrease it from right side as well
			 								// Therefore there is a -i
			 a[a.length-1-i] = temp;
		 }
		 for(int i:a)
		 {
			 System.out.print(i+" ");
		 }

		 }
	}


 
