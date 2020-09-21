
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      int [][]arr={{3,41,24,2},{23,5,3,5},{2,8,6}};
	     int oneDcounter=0;
	     int twoDcounter=0;
	      for(int i=0;i<arr.length;i++)
	      {
	            for(int j=0;j<arr[i].length;j++)
	            {
	                twoDcounter++;  
	            }
	            
	            oneDcounter++;
	            
	            
	      }
		System.out.println("number of 1d array in 2d array is"+oneDcounter);
		System.out.println("number of 1d array in 2d array is"+ twoDcounter);
	}
}
