//To print reverse no. using recursion
public class P2 {
	
public static void main(String[] args) {
	test(5);
}
public static void test(int n)
{
	if(n>=1)
	{
		System.out.println(n--);		
		test(n);
	}
}
}
