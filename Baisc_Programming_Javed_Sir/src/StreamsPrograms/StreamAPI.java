package StreamsPrograms;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		
		//Stream API works only with the collection framework
		
		//1st way to create the list
		List<Integer> l = List.of(1,2,3,4,5,6,7,8,9,10);	//Other method to directly pass the value while creating the list
		//Disadvantage - We cannot add or remove the data from the list as it is now Immutable as we have use of().
		
//		System.out.println(l);
		
		//2nd way to create the list
		List l2 = Arrays.asList(1,2,3,4,5,6);
//		System.out.println(l2);
		
		List listEven = new ArrayList<Integer>();
		
		//Without Stream
//		for(Integer i : l)
//		{
//			if(i%2==0)
//			{
//				 listEven.add(i);
//			}
//		}
//		System.out.println("List of number : "+l);
//		System.out.println("List of even number : "+listEven);
		
		//With Stream
		
//		List<Integer> listStream = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
//		System.out.println("List of number : "+l);
//		System.out.println("List of even number Using Stream : "+listStream);
//		
//		List<Integer> greaterThan5 = l.stream().filter(i -> i>5).collect(Collectors.toList());
//		System.out.println(greaterThan5);
		
		
		//This proves that Streams work with collection as well the group of objects (Arrays)
//		String name[] = {"shanawaz","waqaz","shubham"};
//		Stream<String> stream = Stream.of(name);
//		stream.forEach(e -> System.out.println(e));
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		Stream<Integer> stream = list1.stream();
		stream.forEach(e -> System.out.println(e));
		
	}
}
