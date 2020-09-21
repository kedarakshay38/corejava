/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AverageArray
{
	public static void main (String[] args)
	{int sum=0;
	double avg=0;
	int arr[]=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 10 Numbers");
	      for(int i=0;i<arr.length;i++)
	      {
	            arr[i]=sc.nextInt();
	    
	      }
	      for(int num:arr){
	            sum=sum+num;
	            
	         
	      }
	        System.out.println("sum is"+sum); 
	        avg=sum/10;
	  System.out.println("average is"+avg); 
	}
}
