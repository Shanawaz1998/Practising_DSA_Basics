package LambdaExpression;

public class ThreadsUsingLambda {

	public static void main(String[] args) {
		Runnable r = () -> {
			for(int i = 1;i<=10;i++)
			{
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(r);
		t.setName("Mythread");
		System.out.println(t.getName());
		t.start();
		
		Runnable r2 = () -> {
			for(int i = 11;i<=22;i++)
			{
				System.out.println("From second thread"+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(r2);
		t1.start();
	}
}
