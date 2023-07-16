package _Comparable_;

import java.util.ArrayList;
import java.util.Collections;
//Comparable used for single sorting logic
public class Emp implements Comparable<Emp>{

	String name;
	String phone;
	int empID;
	
	//Inbuilt method of Comparable interface
	public int compareTo(Emp o) {
		return this.empID - o.empID;
	}
	
	public Emp(String name,String phone,int empID)
	{
		this.name = name;
		this.phone = phone;                
		this.empID = empID;
	}
	
	public String toString()
	{
		return name +" "+ phone +" "+ empID;
	}

	public static void main(String[] args) {
		 
		ArrayList<Emp> a = new ArrayList<Emp>();
		 
		a.add(new Emp("XYZ","8356817047",102));
		a.add(new Emp("ABC","123456789",104));
		a.add(new Emp("PQR","9224173244",101));
		
		System.out.println(a);
		//Collections.sort(a);	We cannot use sort()method because it gets confused to compare with which parameter(name or phone or empID)
		//Therefore we use Comparable Interface

		//Comparable - by implementing Comparable interface and then overiding the compareTo()
		Collections.sort(a); //This inside calls compareTo() method
		System.out.println(a);			
		// But is the case of Comparable we can sort only on the basis of single logic(here empID) 
		//If we want to compare on multiple logic then use Comparator (name or phone or empID)
	}
}
