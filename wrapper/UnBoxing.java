package wrapper;

public class UnBoxing {
public static void main(String args[])
{
	Integer a=new Integer(10);
	int i=a.intValue();
	int j=i;
	System.out.println(a+" "+i+" "+j);
}
}
