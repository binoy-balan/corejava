package multithreading;

public class MultiThreading3 extends Thread
{
public void run()
{
   try
   {
    System.out.println("Music Player is running");
    Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
    System.out.println("Recived a whatsapp notification");
    }
}

public static void main(String[] args)
{
	MultiThreading3 obj=new MultiThreading3();
	obj.start();
	obj.interrupt();
}
}