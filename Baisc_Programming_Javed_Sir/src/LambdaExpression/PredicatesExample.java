package LambdaExpression;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

 class Emp{
	
	int eid;
	String name;
	int sal;
	
	public Emp(int eid, String name, int sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}

	
}

public class PredicatesExample {

//	Predicate is a inbuilt functional interface
//	present inside java.util.function pkg
//	test() is the abstract method present inside Predicate inteface 
	
//	public interface Predicate<T>{
//		public boolean test(T t)
//	}



	public static void main(String[] args) {
		
//		Q.1) To find whether the number is greater than 10 or not
		
//		Predicate<Integer> p = i -> i > 10;	//Internally it calls the test() method of Predicate interface
//		System.out.println(p.test(100));
//		System.out.println(p.test(5));
//		
//		Q.2) To find whether the number is even or not
//		Predicate<Integer> p1 = i -> i%2==0;
//		System.out.println(p1.test(2));
//		System.out.println(p1.test(3));
		
//		Q.3) To find whether the String starts with the letter 'K' or not
	
//		String str [] = {"Katrina", "Kajal", "sunny", "Kiara"};
//			Predicate<String> p = s1 -> s1.charAt(0) == 'K';
//			for(String st : str)
//			{
//				if(p.test(st))
//				{
//					System.out.println(st);
//				}
//			}
		
//		Q.4) Remove null and empty Strings from the list
		
//		ArrayList<String> al = new ArrayList<>();
//		al.add(null);
//		al.add("abc");
//		al.add("");
//		al.add("xyz");
//		al.add("Shanawaz");
//		al.add(null);
//		al.add("");
//		System.out.println(al);
//		Predicate<String> p = s -> s != null && s.length() != 0;
//		for(String str : al)
//		{
//			if(p.test(str))
//			{
//				System.out.println(str);
//			}
//		}
		
//		Q.5) To find the Employee salary greater than 1500
		
		ArrayList<Emp> l = new ArrayList<Emp>();
		l.add(new Emp(101,"Shanawaz",1000));
		l.add(new Emp(102,"Meraj",2000));
		l.add(new Emp(103,"Aarif",3000));
	
		Predicate<Emp> p = x -> x.sal>1500;
		for(Emp e : l)
		{
			if(p.test(e))
			{
				System.out.println(e);
			}
		}
		
		
//--------------------------------------------------------------------------------------

//As till now we have seen the Predicate function which only gives boolean values to perform and function 
//we can use Function functional interface which has only apply() method Function<Input datatype, ReturnType>
		
		
//		Q) To calculate the totalSalary of all the employee 

//		ArrayList<Emp> l = new ArrayList<Emp>();
//		l.add(new Emp(101,"Shanawaz",1000));
//		l.add(new Emp(102,"Meraj",2000));
//		l.add(new Emp(103,"Aarif",3000));
//		Function<ArrayList<Emp>,Integer> f = x ->{
//			int totalSal = 0;	
//			for(Emp e : l)
//			{
//				totalSal = totalSal + e.sal;
//			}
//			return totalSal;
//		};
//		System.out.println("The total salary is "+f.apply(l));
		
//		Q) To calculate the Square of the number
		
//		Function<Integer,Integer> f = x ->  x*x;
//		System.out.println(f.apply(3));

//		Q) Increase the salary having lesser than 3000 by 500
		
//		ArrayList<Emp> l = new ArrayList<Emp>();
//		l.add(new Emp(101,"Shanawaz",1000));
//		l.add(new Emp(102,"Meraj",2000));
//		l.add(new Emp(103,"Aarif",3000));
//		
//		Predicate<Emp> p = x -> x.sal<3000;
//		Function<Emp, Emp> f = x -> {
//				x.sal = x.sal + 500;
//				return x;
//		};
//		for(Emp e : l)
//		{
//			if(p.test(e))
//			{
//				 f.apply(e);
//			}
//		}
//		System.out.println(l);
		
//		Q) To remove White spaces from the Sentence
//		String str = "Java is a Programming language";
//		Function<String,String> f = x -> x.replaceAll(" ", "");
//		System.out.println(f.apply(str));
		
//		String str = "Python Programming";
//		Function<String,String> f1 = x -> x.toUpperCase();
//		Function<String,String> f2 = x -> x.substring(0, 5);
//		System.out.println(f1.andThen(f2).apply(str));
		
//----------------------------------------------------------------------------------------------
//		Consumer<Input DataType> is also a functional interface which does not returns any value by using accept()

		
//		Consumer<String> c = x -> System.out.println(x);
//		c.accept("Shanawaz");

//--------------------------------------------------------------------------------------------------
//		Supplier<Return DataType> is just used to return some data by using get()
		
		Supplier<String> s = () -> {
			String str [] = {"abc", "Shanawaz", "Meraj", "Devraj","Aarif"};
			int x = (int) (Math.random()*3+1);
			return str[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
	}	
}
