package Day10;
//Anagram0.0.
public class P2 {

	public static void main(String[] args) {
		String s1 = "att";
		String s2 = "eat";
		if(s1.length() == s2.length())
		{
			char [] c1 = s1.toCharArray();
			char [] c2 = s2.toCharArray();
			sort(c1);
			sort(c2);
			for(int i = 0;i<c2.length;i++)
			{
				if(c1[i] != c2[i])
				{
					System.out.println("Not an Anagram - As charater is not equal");
					return;
				}
			}
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram - As size is not equal");
		}
	}
	//Bubble Sorting
	public static void sort(char c [])
	{
		for(int i = 0;i<c.length;i++) 
		{
			for(int j = 0;j<c.length-1;j++)
			{
				if(c[j] > c[j+1])
				{
				char temp = c[j];
				c[j] = c[j+1];
				c[j+1] = temp;
			}
		}
	}
}
}







