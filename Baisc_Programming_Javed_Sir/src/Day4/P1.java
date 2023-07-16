package Day4;
//How to use Array
public class P1 {

	public static void main(String[] args) {
		int a [] = {11,22,33,44,55};
		System.out.println("Usingn for for loop");
		for(int i =0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("using for each loop");
		for(int i:a){//disadvantage - we cannot control the iteration
			System.out.println(i);
		}
	}

}
