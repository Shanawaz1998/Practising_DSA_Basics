package Interview_Question;

public class Employee {
//Remaining : modify using List, streams API, lambda Exp
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "shan", 24);
		Employee emp2 = new Employee(102, "Bahadur", 11);

		if(emp1.name.equals("shan"))
		{
			System.out.println(emp1.toString());
		}
		else
		{
			System.out.println("Match not found");
		}
	}
}
