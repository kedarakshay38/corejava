import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArraySorting
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int arr[]={12,32,21,42,33,52,48};
	System.out.println("enter the numbers to sort");


	
int n=arr.length;
	int temp=0;
	System.out.println("ARRAY in reverse order");

	for(int i=0;i<(n/2);i++){
	  
	            temp=arr[i];
	            arr[i]=arr[n-1-i];
	            arr[n-1-i]=temp;
	      
	      	   
	}
	  
	
	 for(int num:arr){
	       System.out.println(num);
	 }
	
	
	}
}
