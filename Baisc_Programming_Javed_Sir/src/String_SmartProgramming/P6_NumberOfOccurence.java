package String_SmartProgramming;
import java.util.*;
public class P6_NumberOfOccurence {
	public static void main(String[] args) {
		
		String s = "hello";
		char c[] = s.toCharArray();
		Map<Character,Integer> m = new LinkedHashMap();
		for(int i = 0;i<c.length;i++)
		{
			 if(m.containsKey(c[i]) == false)
			 {
				 m.put(c[i],1);
			 }
			 else
			 {
				 int count = m.get(c[i]);
				 count = count + 1;
				 m.put(c[i],count);
			 }
		}
		System.out.println(m);
		for(Character x : m.keySet())
		{
			System.out.println(x+" "+m.get(x));
		}
	}
}
