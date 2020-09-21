/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{int sum=0;
	int [][]arr=new int[2][3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
	      for(int j=0;j<arr[i].length;j++)
	      {
	            arr[i][j]=sc.nextInt();
	      }
	      
	}
	
	for( int i=0;i<arr.length;i++)
	{
	      for(int j=0;j<arr[i].length;j++)
	      {
	            System.out.println(arr[i][j]);
	      }
	      
	}