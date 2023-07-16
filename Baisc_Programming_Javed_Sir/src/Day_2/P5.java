package Day_2;
//special  number
//Product of the digits and sum of the digits and the addition of both should be equal to the no.
//eg., 19, 29
public class P5 {
public static void main(String[] args) {
	int n = 19;
	int sum = 0;
	int pro = 1;
	int temp = n;
	while (n!=0)
	{
		int d = n%10;
		sum = sum + d;
		pro = pro * d;
		n= n/10;
	}
	int res = sum + pro;
	if(res == temp) {
		System.out.println("Special number");
		
	}
	else 
	{
		System.out.println("Not a Special number");
	}
}
}
