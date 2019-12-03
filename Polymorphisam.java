package core;

public class Polymorphisam {
	void area(int side)
	{
		System.out.println("area of the square is "+(side*side));
	}
	public void area(int l,int b) {
		System.out.println("area of the rectangle is "+(l*b));
	}
public void area(float base,int height)
{
	System.out.println("area of the triangle is "+(0.5)*base*height);
}
public void area(float x)
{
	System.out.println("area of circle is "+(3.14*x*x));
	
}
public static void main(String args[])
{
	Polymorphisam obj=new Polymorphisam();
	obj.area(5);
	obj.area(10,15);
	obj.area(12.5f,8);
	obj.area(4.5f);
}
}