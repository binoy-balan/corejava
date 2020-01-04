package javadatetime;
import java.time.LocalTime;
public class TimeExample1 
{
public static void main(String args[])
{
	//current Time
	LocalTime localtime=LocalTime.now();
	System.out.println(localtime);
	
	//specific Time
	LocalTime localtime2=LocalTime.of(4,30,45);
	System.out.println(localtime2);
	System.out.println("Hour :"+localtime.getHour());
	System.out.println("Minutes :"+localtime.getMinute());
	System.out.println("Second :"+localtime.getSecond());
	
	//LocalTime's plus methods
	System.out.println("Addition of Hours :"+localtime.plusHours(2));
	System.out.println("Addition of Minutes :"+localtime.plusMinutes(25));
	System.out.println("Addition of Seconds :"+localtime.plusSeconds(20));
	System.out.println("Addition of Nanos :"+localtime.plusNanos(20000));
	
	//LocalTime's minus methods
	
	System.out.println("Subtraction of Hours :"+localtime.minusHours(2));
	System.out.println("Subtraction of Minutes :"+localtime.minusMinutes(25));
	System.out.println("Subtraction of Seconds :"+localtime.minusSeconds(20));
	System.out.println("Subtraction of Nanos :"+localtime.minusNanos(20000));
	
	LocalTime localtime3=LocalTime.of(11,45,20);
	
	//compareTo() example
	if(localtime.compareTo(localtime2)==0)
	{
		System.out.println("localdate and localdate2 are equal");
		
	}
	else
	{
		System.out.println("localdate and localdate2 are not equal");
	}
	
	//isBefore() example
	if(localtime2.isBefore(localtime3))
	{
		System.out.println("localtime2 comes before  localdate3");
	}
	
	//isAfter() example
	
	if(localtime3.isAfter(localtime))
	{
		System.out.println("localtime3 comes After  lotcaltime");
	}
		
	}
}

