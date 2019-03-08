class ThreadSynchronization
{
    public static void main(String args[])
    {
        MyThread thread1 = new MyThread("thread1: ");
        MyThread thread2 = new MyThread("thread2: ");
        thread1.start();
        thread2.start();
        boolean thread1IsAlive = true;
        boolean thread2IsAlive = true;
        do {
           if (thread1IsAlive && !thread1.isAlive()) {
               thread1IsAlive = false;
               System.out.println("Thread 1 is dead.");
           }
           if (thread2IsAlive && !thread2.isAlive()) {
               thread2IsAlive = false;
               System.out.println("Thread 2 is dead.");
           }
        } while(thread1IsAlive || thread2IsAlive);
    }
}
 
class MyThread extends Thread
{
static String message[] =
{ "Java", "is", "hot,", "aromatic,", "and", "invigorating."};
 
    public MyThread(String id)
    {
        super(id);
    }
 
    public void run()
    {
        SynchronizedOutput.displayList(getName(),message);
    }
 
    void randomWait()
    {
        try {
           sleep((long)(3000*Math.random()));
        } catch (InterruptedException x) {
           System.out.println("Interrupted!");
        }
    }

public static   void displayList(String name,String list[])
{
for(int i=0;i<list.length;++i) {
MyThread t = (MyThread) Thread.currentThread();
t.randomWait();
System.out.println(name+list[i]);
}
}
}
}
 
class SynchronizedOutput
{class Customer {
   int amount=0;
   int flag=0;
   public synchronized int withdraw(int amount){
 System.out.println(Thread.currentThread().getName()+" is going to withdraw");
 
       if(flag==0){
           try{
  System.out.println("waiting....");
  wait();
      }catch(Exception e){}
 }
 this.amount-=amount;
 System.out.println("withdraw completed");
 return amount;
     }

     public synchronized void deposit(int amount){
 System.out.println(Thread.currentThread().getName()+" is going to  deposit");
 this.amount+=amount;
 System.out.println("deposit completed");
        notifyAll();
        flag=1;
    }
 }

public class SyncThreadDemo {
    public static void main(String[] args) {
 final Customer c = new Customer();
 
 Thread t1 = new Thread(){
  public void run(){
   c.withdraw(5000);
   System.out.println("After withdraw amount is "+c.amount);
                        
  }
   };
 
 Thread t2 = new Thread(){
  public void run(){
   c.deposit(9000);
   System.out.println("After deposit amount is "+c.amount);
  }
    };

 t1.setName("Dinesh");
        t2.setName("Sweety");
 t1.start();
 t2.start();

    }
}class Customer {
   int amount=0;
   int flag=0;
   public synchronized int withdraw(int amount){
 System.out.println(Thread.currentThread().getName()+" is going to withdraw");
 
       if(flag==0){
           try{
  System.out.println("waiting....");
  wait();
      }catch(Exception e){}
 }
 this.amount-=amount;
 System.out.println("withdraw completed");
 return amount;
     }

     public synchronized void deposit(int amount){
 System.out.println(Thread.currentThread().getName()+" is going to  deposit");
 this.amount+=amount;
 System.out.println("deposit completed");
        notifyAll();
        flag=1;
    }
 }

public class SyncThreadDemo {
    public static void main(String[] args) {
 final Customer c = new Customer();
 
 Thread t1 = new Thread(){
  public void run(){
   c.withdraw(5000);
   System.out.println("After withdraw amount is "+c.amount);
                        
  }
   };
 
 Thread t2 = new Thread(){
  public void run(){
   c.deposit(9000);
   System.out.println("After deposit amount is "+c.amount);
  }
    };

 t1.setName("Dinesh");
        t2.setName("Sweety");
 t1.start();
 t2.start();

    }
}
