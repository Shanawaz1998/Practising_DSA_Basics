//swapping without third variable
public class P10 {

	public static void main(String[] args) {
		System.out.println("Before swapping");
		int a = 10;
		int b = 23;
		System.out.println(a+" "+b+" ");
		
		System.out.println("After swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b+" ");
	}

}
