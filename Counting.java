package Multithreading;


public class Counting {
	public static void main(String[] args) throws InterruptedException {
		First_thread F = new First_thread();
		Second_thread S = new Second_thread();
		
		Thread T = new Thread(F);
		Thread T1 = new Thread(S);
		
		T.start();
		T.join();
		
		T1.start();
		T1.join();
	}
}

class First_thread implements Runnable
{

	int count = 1;
	public void run() {
		while(count<=500)
		{
			System.out.println(count);
			count++;
		}
		try
		{
			Thread.sleep(400);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occurred");
		}
	}
	
}
class Second_thread implements Runnable
{

	int count = 501;
	public void run() {
		while(count <= 1000)
		{
			System.out.println(count);
			count++;
		}
		try
		{
			Thread.sleep(400);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occurred");
		}
	}
	
}