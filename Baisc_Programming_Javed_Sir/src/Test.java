

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Inside run method");
	}
	public void run(int n)
	{
		System.out.println("Ariguments run method");
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		t.run(0);
		
		
	}
}
