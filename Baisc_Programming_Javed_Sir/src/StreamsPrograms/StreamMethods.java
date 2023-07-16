package StreamsPrograms;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String[] args) {
		
		
		List<String> names = List.of("Aman","Ankit","Shanawaz");
		List<String> nameStartsA = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
		System.out.println(nameStartsA);
		
		names.stream().sorted().forEach(System.out::println);
	}
}
