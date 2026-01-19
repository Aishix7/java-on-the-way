class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hi");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hello");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class RunnableMethod 
{
    public static void main(String[] args) 
    {
        // Thread usually accepts runnable obj. 
        // so obj1 and obj2 are runnable object.
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        Thread t1 = new Thread(obj1); // Thread objects
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}

// 1. class extends Thread
// 2. thread implements runnable
// so possible that, class implements runnable
// runnable is a functional interface so we can use lambda functions here