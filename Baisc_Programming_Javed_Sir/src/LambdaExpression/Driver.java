package LambdaExpression;

import java.util.Scanner;

@FunctionalInterface	//This will give error if we use more than one abstract method in the interface
interface MyInterface {
	public abstract void sayHello();
}

class MyInterfaceImplementation implements MyInterface{

	public void sayHello() {
		System.out.println("Saying hello from MyInterfaceImplementation");		
	}

}
public class Driver {
	public static void main(String[] args) {
		
		//Approach 1 to use funtional Interface 
//		MyInterface mi = new MyInterfaceImplementation();
//		mi.sayHello();
		
//		Approach 2 - By using Anonymous class
		MyInterface m1 = new MyInterface() {		//As we know we cannot create the object of the interface, but here we are creating the object of the child class of that interface(MyInterface)
			public void sayHello() {
				System.out.println("hello from First annonymous class");
				
			}
		};
		m1.sayHello();
//		
//		MyInterface m2 = new MyInterface() {
//			
//			public void sayHello() {
//				System.out.println("hello from Second annonymous class");			
//			}
//		};
//		m2.sayHello();
		
		//Approach 3 - Lambda Expression
		
		
		MyInterface i = () -> System.out.println("From First Lambda Expression");	//Refer sayHello method from MyInterfaceImplementation
		i.sayHello();
//
//		
//		MyInterface i2 = () -> System.out.println("From second Lambda Expression");
//		i2.sayHello();
		
		
		//Adding 2 numbers using lambda expression
			
		sumInterface si = ( a,b) ->  a+b;	//No need to add return as it is done bydefault
		System.out.println("Adding using lambda expression : "+si.sum(12, 3));
		
		Scanner sc = new Scanner(System.in);
		lengthInterface sil = (str) -> str.length();
		System.out.println(sil.length(sc.nextLine()));
		
	}
}



