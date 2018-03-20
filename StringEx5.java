package test.jar1;

/* public boolean equals(String);
          IQ:  == vs equals( );   */

import java.lang.String;
class StringEx5
{   public static void main(String args[])
   	   { String s1="Sai";
	    // String s3="Sai"; 
	     String s3=new String("Sai");
		    if(s1==s3)
		      System.out.println("B R S");
			else
				System.out.println("B R N S ");

          if( s1.equals(s3) )
			  System.out.println("Same");
		  else
			  System.out.println("Not ");

	   }
}
