package LambdaExpression;

import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(5);
		
		long li = al.stream().filter(n -> n>=5).count();
		System.out.println(li);
		
		
	}
}
