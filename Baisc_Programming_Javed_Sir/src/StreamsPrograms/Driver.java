package StreamsPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

 class Emp
{
	int id;
	String name;
	int age;
	public Emp(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Driver {
	
	public static void main(String[] args) {
		
		ArrayList<Emp> l = new ArrayList<>();
		
		l.add(new Emp(101,"Shanawaz", 22));
		l.add(new Emp(102,"Shubham", 32));
		l.add(new Emp(103,"Aarif", 21));
		l.add(new Emp(104,"Meraj",25));
		
		l.stream().forEach(x -> 
		{
			boolean chk = false;
			if(x.name.equals("Shubham"))
			{
				System.out.println(x.name +" "+ x.age+" "+ x.id);
				chk = true;
			}
			
		});
		
		
	}

}
