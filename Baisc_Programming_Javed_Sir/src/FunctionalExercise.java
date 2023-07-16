import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

 class Employee {
	//Remaining : modify using List, streams API, lambda Exp
		int id;
		String name;
		int sal;
		
		public Employee(int id, String name, int sal)
		{
			this.id=id;
			this.name=name;
			this.sal=sal;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
		}
}
public class FunctionalExercise {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "shanawaz", 29000);
		Employee emp2 = new Employee(102, "Devraj", 16000);
		Employee emp3 = new Employee(103, "Aarif", 17000);
		Employee emp4 = new Employee(104, "Meraj", 12000);
		
		ArrayList<Employee> l = new ArrayList<>();
		l.add(emp1);
		l.add(emp2);
		l.add(emp3);
		l.add(emp4);
		
		List<Employee> list = l.stream().filter((x) -> x.sal>=16000).collect(Collectors.toList());
		System.out.println(list);
		
	}
}