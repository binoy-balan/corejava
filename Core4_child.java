package core;

public class Core4_child extends Core4
{
 public void add()
 {
	 int a=10,b=10,c;
	 c=a+b+10;
	 System.out.println(c);
 }
 public static void main(String args[])
	{
		Core4 obj=new Core4_child();
		obj.add();
	}
	
}