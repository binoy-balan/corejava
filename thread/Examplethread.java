package thread;
class MusicPlayer extends Thread
{
	public  void run()
	{
			System.out.println("Music is playing");
		
	}
}
class MsWord implements Runnable
{
	public void run()
	{
			System.out.println("Typing Ms Word document");
	}
}

public class Examplethread
{
public static void main(String args[])
{
	
	 MusicPlayer music=new  MusicPlayer();
	 Runnable obj=new MsWord();
	 Thread th=new Thread(obj);
	// MsWord obj1=new MsWord();
     music.start();
     th.start();
}
}
