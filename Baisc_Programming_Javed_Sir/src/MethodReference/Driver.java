package MethodReference;

import java.util.ArrayList;
import java.util.List;


public class Driver {
	public static void main(String[] args) {
		
		//Types of method reference
		//1. Static method
		//2. Instance method of particular object
		//3. Contructor
		
		//1. Static method
		
		
		//Without Method reference
//		MyInterface MyInter = () -> {
//			System.out.println("Using Lambda Expression");
//		};
//		MyInter.doTask();
		
		
		
		//To refer static method
		//ClassName :: MethodName
		MyInterface inter = ClassStuff::doStuff;	//Here we can create the lambda expression or else we can refer the method which is return in the class ClassStuff
		inter.doTask();
		
		Runnable r = ClassStuff::stuffthread;
		
		Thread t = new Thread(r);
		t.start();
		
		//2. Instance method of particular object
		//objectRef :: method name
		ClassStuff ref = new ClassStuff();	//As we cannot directly access the non static method directly we have create the object of the class, then call it 
		Runnable r1 = ref::printNumber;
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		List l = List.of(111,222,333,444,555);
		
		l.stream().forEach(e -> System.out.println(e));		//Without method reference 
		l.stream().forEach(System.out::println);
	}
}
