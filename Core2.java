package core;

import java.io.IOException;
import java.util.Scanner;

public class Core2 {
	String name;
	String address;
	Long contactno;
	String emailid;
	String proof;
	String proofid;
 static int reg=0;
  Core2(String name,String address,Long contactno,String emailid,String  proof,String proofid)
  {
	this.name= name;
	this.address= address;
	this.contactno= contactno;
	this.emailid= emailid;
	this.proof= proof;
	this.proofid=proof;
  }
  
   String register() {
	    String a;
	    Scanner sc=new Scanner(System.in);

	}	  
  void display()
  {
  	System.out.println("name:"+name);
  	System.out.println("address:"+address);
  	System.out.println("contactNumber:"+contactno);
  	System.out.println("Email:"+emailid);
  	System.out.println("proofType:"+proof);
  	System.out.println("proofID:"+proofid);
  	System.out.println("Registered Successfully"+"Register Number is :"+ ++reg);

  }

  }


