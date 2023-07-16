package Day_2;
//Check for Palindrome
public class P2 {

	public static void main(String[] args) {
		int n = 12221;
		int rev = 0;
		int temp = n;
		while (n!=0)
		{ 
			int d = n%10;
			rev = rev *10+d;
			n = n /10;
		}
		if (temp == rev)
		{
			System.out.println("Palindrom Number");
		}
		else 
		{
			System.out.println("Not a palindrome Number");
		}
	}

}
