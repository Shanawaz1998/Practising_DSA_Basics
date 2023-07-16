package Day6;
//Linear Search
public class P1 {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};
		int search = 0;
		int check = 0;
		for (int i = 0;i<a.length;i++)
		{
		if(search == a[i])
		{
			System.out.println("The value if present at the index : " +i);
			check++;
			return;
		}
		
		}
		if(check == 0)
		{
			System.out.println("Not present");
		}
	}

}
