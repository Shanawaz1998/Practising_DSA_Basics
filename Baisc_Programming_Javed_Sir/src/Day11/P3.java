package Day11;
//Input - Java is a programming language Java is a high level programming language
//Output - Python is a programming language Python is a high level programming language
//Withput using replace method
public class P3 {

	public static void main(String[] args) {
	String s = "Java is a programming language Java is a high level programming language";
	String a [] = s.split(" ");
	
	for(int i = 0;i<a.length;i++)
	{
		if(a[i].equals("Java"))
		{
			a[i] = "Python";
		}
	}

	for(String x : a)
	{
		System.out.print(x+ " ");
	}
	}

}
