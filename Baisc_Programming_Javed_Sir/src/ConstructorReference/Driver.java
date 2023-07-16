package ConstructorReference;

public class Driver {
	
	public static void main(String[] args) {
		
		
//		Using Lambda Expression
//		Provider provider = () -> 
//		{
//			return new Student(); 
//			
//		};	
//		Student student = provider.getStudent();
//		student.display();
		
		
//		------------------------------------------
		
		
//		Using Constructor reference 
		Provider provider = Student::new;
		
		Student student = provider.getStudent();
		student.display();
	}

}
