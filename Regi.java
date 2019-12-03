package core;

import java.io.IOException;
import java.util.Scanner;
public class Regi {
	String name;
	String address;
	Long contactno;
	String emailid;
	String proof;
	String proofid;

	public static void main(String args[]) throws IOException 
				{
					Regi obj= new Regi();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		    obj.name =s.next();
		System.out.println("Enter your address");
		obj.address=s.next();
		System.out.println("Enter your Contact Number");
		    obj.contactno=s.nextLong();
		System.out.println("Enter your E-Mail ID");
		obj.emailid=s.next();
		System.out.println("Enter your proof type");
		obj.proof=s.next();
		System.out.println("Enter your proof ID");
		obj.proofid=s.next();
		System.out.println("......Details.......");
		System.out.println("name:"+obj.name);
		System.out.println("address:"+obj.address);
		System.out.println("contactno:"+obj.contactno);
		System.out.println("emailid:"+obj.emailid);
		System.out.println("proof:"+obj.proof);
		System.out.println("proofid:"+obj.proofid);
	}
}
