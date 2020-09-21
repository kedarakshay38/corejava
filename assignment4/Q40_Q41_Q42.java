/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;



class MathOperation{
 
    
   static int multiply(int a, int b){
        return a*b;
    }
    static float multiply(float a, float b,float c){
        return a*b*c;
    }
  static double power(double a,double b){
    return Math.pow(a,b);
}
}



class Demo
{
	public static void main (String[] args) throws java.lang.Exception
	{
        
    
        System.out.println(MathOperation.multiply(12,24));   
          System.out.println(MathOperation.multiply(12f,24f,21f));
           
    

	}
}
