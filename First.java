package ThreadDemo;

public class First {
	
//	 synchronized 
	 
	 public void display(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

class second extends Thread
{
	String msg;
	First fobj;
	second(First fp,String str)
	{
		fobj=fp;
		msg= str;
		start();
		
		
		
	}
	public void run()
	{
		synchronized (fobj) 
		{	 
		fobj.display(msg);
		}
	}

}
