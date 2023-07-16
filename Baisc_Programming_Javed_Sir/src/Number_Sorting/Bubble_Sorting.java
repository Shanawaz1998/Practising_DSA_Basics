package Number_Sorting;

public class Bubble_Sorting
{
	 public static void main(String[] args) {
	      int a[] = {2,3,1,5,4,0};
	      for(int i = 0;i<a.length;i++)  //For traversing the array, -1 as last element will be sorted
	      {
	    	  for(int j = 0;j<a.length-1-i;j++)
	    	  {
	    		  if(a[j] > a[j+1])
	    		  {
	    			  int temp = a[j];
	    			  a[j] = a[j+1];
	    			  a[j+1] = temp;
	    		  }
	    	  }
	      }
	      for(int x : a)
	      {
	    	  System.out.print(x);
	      }
	 }
}
