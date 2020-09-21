/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the no of elements required");
int n=sc.nextInt();	    
	
	int arr[]=new int[n];
	
	System.out.println("enter  elements ");
	for(int i=0;i<arr.length;i++)
	{
	    arr[i]=sc.nextInt();
	}
	
	for(int num:arr){
	   System.out.println(num);
	}
	int sumo=0;
	int sume=0;
	
		for(int i=0;i<arr.length;i++)                                                                   
	{
	   if(arr[i]%2==0)
	   {
	      sume=sume+arr[i];                                                                                                                                             
	   }
	   else{
	       sumo=sumo+arr[i];
	   }
	}
		   System.out.println(sume);
		   	   System.out.println(sumo);
	
	}
}
