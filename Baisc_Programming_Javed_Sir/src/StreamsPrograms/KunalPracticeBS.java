package StreamsPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KunalPracticeBS{
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(41);
		ar.add(0);
		ar.add(-11);
		ar.add(23);
		ar.add(99);
		ar.add(100);
		ar.add(-22);
		
		
		//filter(predicate) filter always takes predicate in the paranthesis only returns true or false 
		System.out.println("-------Using filter to get the values greater than 20----------");
		List<Integer> l =	ar.stream().filter((n) -> n>20).collect(Collectors.toList());//n refers to as objects (eg., 41,0.-11...etc)
		System.out.println(l);
		
		//map(function) always takes function in the paranthesis and makes operation on the variable
		System.out.println("-------Using map to add 20---------");
		List<Integer> l1 = ar.stream().map((n) -> n+20).collect(Collectors.toList());
		System.out.println(l1);
		
		//count() it returns the number of count present
		System.out.println("-------Using number of element greater than 20---------");
		long cnt = ar.stream().filter(n -> n>20).count();
		System.out.println(cnt);
		
		System.out.println("----------Using for Each loop----------");
		
		ar.stream().forEach((n) -> System.out.println(n));
		
		System.out.println("--------Minimum number--------");
		Integer l2 = ar.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println(l2);
		
		
		System.out.println("-------Maximum number--------");
		Integer l3 = ar.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println(l3);
		
		System.out.println("-------Sorted number--------");
		List<Integer> l4 = ar.stream().sorted((x,y) -> x.compareTo(y)).collect(Collectors.toList());
//		List<Integer> l4 = st2.sorted().collect(Collectors.toList());	//This is also valid as it bydefault sorts in ascending order
		System.out.println(l4);
		
		
		System.out.println("-------Descending Sorted number--------");
		List<Integer> l5 = ar.stream().sorted((x,y) -> y.compareTo(x)).collect(Collectors.toList());
		System.out.println(l5);
		
		
			
		
		
		
	}
}

