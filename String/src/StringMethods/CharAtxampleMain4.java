package StringMethods;

public class CharAtxampleMain4 
{
	public static void main(String args[])
	{
		String str="Welcome to FACE portal";
		 int count = 0;  
	        for (int i=0; i<=str.length()-1; i++)
	        {  
	            if(str.charAt(i) == 't')//checking the character is t or not
	            {  
	                count++;  //if t is found the value is updated
	            }  
	        }  
	        System.out.println("Frequency of t is: "+count);  
	    }  
	}


