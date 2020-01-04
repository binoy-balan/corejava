package multithreading;

public class DaemonThreadExample extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())//checking for daemon thread
		{
		System.out.println("Daemon thread work.");	
		}
		else
		{
			System.out.println("User thread work");	
		}
	}
	public static void main(String args[])
	{
		DaemonThreadExample t1=new DaemonThreadExample();//creating thread	
		DaemonThreadExample t2=new DaemonThreadExample();
		DaemonThreadExample t3=new DaemonThreadExample();
	}

}
