import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
      
        int large=0; 
        int num;

        System.out.println("enter the number");

        Scanner input=new Scanner(System.in);

        int n=input.nextInt();

        for(int i=0;i<n;i++)
        {
          num=input.nextInt();
          if(num>large)
          {
           large=num;
          }
          System.out.println("the largest is:"+large);
         
      }
	}
}
