package Number_Sorting;
//Advantage of Bubble sorting is it will maintain the stability of the array
//it means it will retain the occurence of the element for the duplicate element
public class Bubble_Sorting
{
	 public static void main(String[] args) {
	      int a[] = {1,2,3,4,5};
		  boolean swapped;
	      for(int i = 0;i<a.length;i++)  //For traversing the array, -1 as last element will be sorted
	      {
			  swapped = false;
	    	  for(int j = 0;j<a.length-1-i;j++)
	    	  {
	    		  if(a[j] > a[j+1])
	    		  {
	    			  int temp = a[j];
	    			  a[j] = a[j+1];
	    			  a[j+1] = temp;
					  swapped = true;
	    		  }
	    	  }
			  //If we did not swap for a particular value of i, it means the arrays is sorted
			  // and no need to traverse further.
			  if(swapped == false){
				  break;
			  }
	      }
	      for(int x : a)
	      {
	    	  System.out.print(x);
	      }
	 }
}
