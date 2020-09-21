
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      int []arr={12,32,43,14,53};
	      int n=arr.length;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter no t search");
	      int No=sc .nextInt();
	      
	      for(int i=0;i<n;i++)
	      {
	        if(arr[i]==No)
	        {
	             System.out.println("we found it at "+i+"="+arr[i]);
	        }
	      }
	      
    }
}