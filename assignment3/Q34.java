
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     int [][]arr=new int[3][3];
	     int sum=0;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the elements");
	     for(int i=0;i<arr.length;i++)
	     {
	           for(int j=0;j<arr[i].length;j++)
	           {
	                 arr[i][j]=sc.nextInt();
	           }
	     }
	     
	      for(int i=0;i<arr.length;i++)
	     {
	           for(int j=0;j<arr[i].length;j++)
	           {
	                 if(i==j)
	                 {
	                       sum=sum+arr[i][j];
	                       continue;
	                 }
	           }
	     }
	     
	     System.out.println(sum);
	      
	      
	}
}
