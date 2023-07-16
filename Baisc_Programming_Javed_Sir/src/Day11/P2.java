 package Day11;

public class P2 {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Bye";
		System.out.println("Befor swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.length());
		System.out.println(b.length());
		a = a.concat(b);    //or a + b
		b = a.substring(0, a.length()-b.length()); 		//As now a.length() is 8
		a = a.substring(b.length());
		System.out.println("=====================");
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
	}

}
