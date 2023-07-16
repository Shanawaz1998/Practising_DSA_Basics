package DSA_KunalKushwaha;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
//MultiDimensional Array using ArrayList
public class ArrayListOfArrayList {
 public static void main(String[] args) {
	
	 //As initial space of arrayList is 10 it create another set of ArrayList when more than half the no. of element is increased
	  ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	  Scanner sc = new Scanner(System.in);
	  
	  //To initialise the Arraylist
	  for(int i = 0;i < 3;i++)
	  {
		  list.add(new ArrayList<Integer>());
	  }
	  
	  //To add the data into the list
	  for(int i = 0;i < 3;i++)
	  {
		  for(int j = 0;j<3;j++)
		  {
			  list.get(i).add(sc.nextInt());			  
		  }
	  }
	 
	  System.out.println(list);
}
}
