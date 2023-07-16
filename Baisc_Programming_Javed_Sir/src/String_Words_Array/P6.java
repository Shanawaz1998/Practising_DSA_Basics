	package String_Words_Array;
//Sample Input - Java is a programming language it is used to do programming Java is a high level language
//Sample output	6

public class P6 {
	public static void main(String[] args) {
		String s = "Java is a programming language it is used to do programming Java is a high level language";
		String c [] = s.split(" ");
		int dupliCount = 0;
		String dupliWords = "";
		String x = "";
		boolean b[] = new boolean[c.length];
		
		for(int i =0;i<c.length;i++)
		{
			if(b[i]==false) 
			{
				int count = 1;
				for(int j = i+1;j<b.length;j++)
				{
					if(c[i].equals(c[j]))
					{
						count++;
						b[j] = true;
					}
				}
				if(count>1)
				{
					dupliCount++;
					dupliWords = dupliWords + c[i] + " ";
					x = x + count + " ";
				}
			}
		}
		System.out.println("There are "+dupliCount+ " no. of duplicates" );
		System.out.println("They are '" +dupliWords +"' and they have occured this no.of times " +x );
	
		}
}
