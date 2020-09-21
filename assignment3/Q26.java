
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArraySorting
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int arr[]=new int[10];
	System.out.println("enter the numbers to sort");
	Scanner sc =new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
	      arr[i]=sc.nextInt();
	}
	

	int temp=0;
	System.out.println("sorted in descending order");
	{for(int i=0;i<arr.length;i++)
	{
	      for(int j=i+1;j<arr.length;j++){
	            
	           if(arr[i]<arr[j])
	           {
	                 temp=arr[i];
	                 arr[i]=arr[j];
	                 arr[j]=temp;
	           }
	      }
	}
	  
	
	  
	}
	 for(int num:arr){
	       System.out.println(num);
	 }
	
	
	}
}
