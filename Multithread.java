package ThreadDemo;

 class MultithreadingDemo extends Thread {

	
	public void run()
	{
		try
		{
			System.out.println("thread" +Thread.currentThread().getId() + " is running ");
			
		}
		catch(Exception e)
		{
			System.out.println("exception is caught");
		}
	}
}

public class Multithread
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=8;
for(int i=0;i<n;i++)
{
	MultithreadingDemo object =new MultithreadingDemo();
	object.start();
}
System.out.println("this is main thread");
	}

}
