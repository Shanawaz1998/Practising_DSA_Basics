package MethodReference;

public class ClassStuff {
	
	//We are here overriding the doTask() method and we need to maintain the number of argument same in the paranthe
	public static void doStuff()
	{
		System.out.println("I am doing some stuff of work");
	}
	
	public static void stuffthread()
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void printNumber()
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println(i+100);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
