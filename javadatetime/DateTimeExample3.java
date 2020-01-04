package javadatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeExample3 
{
public static void main(String args[])
{
	//ISO Date
	LocalDate localdate=LocalDate.now();
	DateTimeFormatter dateformatter=DateTimeFormatter.ISO_LOCAL_DATE;
	System.out.println(localdate.format(dateformatter));
	
	//yyyy//MM/dd pattern
	
	DateTimeFormatter dateformatter1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
	System.out.println(localdate.format(dateformatter1));
	
	//MMMM dd, yyyy pattern
	
	DateTimeFormatter dateformatter2=DateTimeFormatter.ofPattern("MMMM dd,yyyy");
	System.out.println(localdate.format(dateformatter2));
	
	 //dd-MMMM-yyyy pattern 
	
	DateTimeFormatter dateformatter3=DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
	System.out.println(localdate.format(dateformatter3));
	  
	
	//dd-LL-yyyy pattern
	
	DateTimeFormatter dateformatter4=DateTimeFormatter.ofPattern("dd-LL-yyyy");
	System.out.println(localdate.format(dateformatter4));
	
	
}
}
