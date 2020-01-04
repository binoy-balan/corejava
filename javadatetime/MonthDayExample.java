package javadatetime;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
public class MonthDayExample  
{
public static void main(String args[])
{
	MonthDay month=MonthDay.now();//current month and day
	LocalDate date=month.atYear(2019);//current month and day at the specific year
	System.out.println(date);
	boolean a=month.isValidYear(2018);
	System.out.println(a);
	long b=month.get(ChronoField.MONTH_OF_YEAR);
	System.out.println(b);
	ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);//number of month
	System.out.println(r1);
	ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);//number of days in the month
	System.out.println(r2);	
}
}
