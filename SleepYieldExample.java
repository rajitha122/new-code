package ThreadDemo;
public class SleepYieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " is sleeping for 3 seconds");
		try
		{
			Thread.currentThread().sleep(3000);
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("main thread had enough sleep");
		
		//yield example
		System.out.println("yield example starts");
		Thread producer=new producer();
		Thread consumer=new consumer();
		producer.setPriority(Thread.MIN_PRIORITY);
		consumer.setPriority(Thread.MAX_PRIORITY);
		producer.start();
		consumer.start();
	}

}
class producer extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("ia m producer: producing item" +i);
			Thread.yield();
		}
	}
}
class consumer extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("i am consumer : consumer item" +i);
			Thread.yield();
		}
	}
}
