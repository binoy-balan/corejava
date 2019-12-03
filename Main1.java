package core;

import java.io.IOException;
import java.util.Scanner;
public class Main1 {
	//Core2 obj=new Core2;
	public static void main(String args[]) throws IOException {
		String name;
		String address;
		Long contactno;
		String emailid;
		String proof;
		String proofid;
		String a = null;
		String d;
		do
		{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		     name=s.next();
		System.out.println("Enter your address");
		address=s.next();
		System.out.println("Enter your Contact Number");
		    contactno=s.nextLong();
		System.out.println("Enter your E-Mail ID");
		emailid=s.next();
		System.out.println("Enter your proof type");
		proof=s.next();
		System.out.println("Enter your proof ID");
		proofid=s.next();
		Core2 obj=new Core2(name,address,contactno,emailid,proof,proofid);
		obj.display();
		System.out.println("Do you want to continu(yes/no)");
		 a=s.next();
		
				}
		while(a.equals("yes"));
		
		
}

}
