/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;



class MathOperation{
 
    
   static int multiply(int a, int b)
   {
        return a*b;
    }
   
    static float multiply(float a, float b,float c)
    {
        return a*b*c;
    }
      
   static  int multiply(int arr[])
     {
           int pro=1;
           for(int i=0;i<arr.length;i++)
           {
                 pro=pro*arr[i];
           }
           
           return pro;
     }

static double multiply(double x,int y)
{
      return x*(double)y;
}

}



class Demo
{
	public static void main (String[] args) throws java.lang.Exception
	{
        
    
        System.out.println(MathOperation.multiply(12,24));   
          System.out.println(MathOperation.multiply(12f,24f,21f));
           int arr[]={1,4,3};
           System.out.println(MathOperation.multiply(arr));
           System.out.println(MathOperation.multiply(2.3,4));
           
    

	}
}
