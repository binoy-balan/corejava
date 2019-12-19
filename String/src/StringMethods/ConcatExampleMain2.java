package StringMethods;

public class ConcatExampleMain2 
{
	public static void main(String args[])
	{
		String str1="Hello";
		String str2="FACE@2.0";
		String str3="Reader";
		//concatenating one string
		String str4=str1.concat(str2);
		System.out.println(str4);
		//concatenating multiple strings
		String str5=str1.concat(str2).concat(str3);
		System.out.println(str5);
     }
}