/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
int [] arr[]={{12,23,10,53,9},{32,12,56,34},{53,64,26,75}};

int large=arr[0][0];
int small=arr[0][0];
for(int i=0;i<arr.length;i++)
{for(int j=0;j<arr[i].length;j++)
{
     if(large<arr[i][j])
     {
          large=arr[i][j];
     }
     
if(small>arr[i][j])
{
     small=arr[i][j];
}
}
}

System.out.println("large"+large);
System.out.println("small"+small);

	}
}
