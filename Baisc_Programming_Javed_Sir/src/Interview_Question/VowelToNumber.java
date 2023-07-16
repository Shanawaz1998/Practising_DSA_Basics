package Interview_Question;

public class VowelToNumber {
	
	public static void main(String[] args) {
		String s ="sankey solution";
		char a [] = s.toCharArray();
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] == 'a')
			{
				a[i] = '1';
			}
			else if(a[i] == 'e')
			{
				a[i] = '2';
			}
			else if(a[i] == 'i')
			{
				a[i] = '3';
			}
			else if(a[i] == 'o')
			{
				a[i] = '4';
			}
			else if(a[i] == 'u')
			{
				a[i] = '5';
			}
			
			
		}
		for(char x : a)
		{
			System.out.print(x );
		}
	}
}
