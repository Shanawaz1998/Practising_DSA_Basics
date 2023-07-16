package DSA_KunalKushwaha;
// Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;

public class LCM_HCF {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int smallNum = Math.min(num1, num2);	//To get the smallest no. as we have check till no. is divisible till the smallest no.
	int HCF=0;
	for(int i = 1;i<=smallNum;i++)
	{
		if(num1%i==0 && num2%i==0)
		{
			HCF = i;
		}
	}
	
	//Formula :- LCM X HCF = num1 X num2
	int LCM = (num1 * num2) / HCF;
	System.out.println("The LCM of the number is : "+LCM );
	System.out.println("The HCF of the number is : "+HCF );
	
	
}
}
