package Number_Sorting;

public class Selection_Sorting {
	public static void main(String[] args) {
		int a [] = {5,4,3,2,1};

		//By using maximum element in the array
		for(int i = 0;i<a.length;i++){
			int max = i;
			int last = a.length - i - 1;
			for(int j = i;j<a.length;j++){
				if(a[j] > max){
					max = j;
				}
			}
			int temp = a[max];
			a[max] = a[last];
			a[last] = temp;
		}


		//By using maximum element in the array
//		for(int i = 0;i<a.length;i++)
//		{
//			int min = i;						//To check it with the first value in the array
//			for(int j = i+1;j<a.length;j++)  	//To find the minimum value in the array
//			{
//				if(a[j] < a[min])
//				{
//					min = j;
//				}
//			}
//			int temp = a[i];
//			a[i] = a[min];
//			a[min] = temp;
//		}
		for(int x : a)
		{
			System.out.print(x);
		}
	}
}
