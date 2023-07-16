package Interview_Question;

public class CallingMainMethod {
	static int i = 1;
	public static void main(String[] args) {
		String [] s = {"one","two"};
		System.out.println("Inside main");
		if(i<10)
		{
			i++;
			main(s);
		} 
	}
}
