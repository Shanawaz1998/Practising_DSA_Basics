package Interview_Question;

import java.util.ArrayList;


import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeObjectList {
	
	int id;
	String name;
	int age;
	
	public EmployeeObjectList(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "EmployeeObjectList [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		List<EmployeeObjectList> emp = new ArrayList<EmployeeObjectList>();
		
		emp.add(new EmployeeObjectList(101,"Shanawaz",24));
		emp.add(new EmployeeObjectList(102,"Bahadur",22));
		emp.add(new EmployeeObjectList(103,"Abdul",45));
		
		String names = emp.stream().filter(x -> x.getName().equals("Bahadur")).collect(Collectors.toList()).toString();
		
		System.out.println(names);
		
		//To get the Employees greater than 23
		List<EmployeeObjectList> ageGreater = emp.stream().filter(x -> x.age > 23).collect(Collectors.toList());
		System.out.println("Age greater than 23 : "+ageGreater);
		

//		Using Predicates
		
//		ArrayList<EmployeeObjectList> l = new ArrayList<EmployeeObjectList>();
//		l.add(new EmployeeObjectList(101,"Shanawaz",22));
//		l.add(new EmployeeObjectList(102,"Meraj",23));
//		l.add(new EmployeeObjectList(103,"Aarif",23));
//		
//		Predicate<EmployeeObjectList> p = x -> x.name.equals("Meraj");
//		for(EmployeeObjectList e : l)
//		{
//			if(p.test(e))
//			{
//				System.out.println(e);
//				return;
//			}
//		}
//		System.out.println("Not Present");
	}	
	

}
