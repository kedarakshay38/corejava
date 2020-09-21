/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;



class MathOperation{
   static int add(int a,int b){
        return a+b;
    }
   static int substract(int a, int b){
        if(a>b){
            return a-b;
        }
        else
    return  b-a;
    }
    
   static int multiply(int a, int b){
        return a*b;
    }
  static double power(double a,double b){
    return Math.pow(a,b);
}
}



class Demo
{
	public static void main (String[] args) throws java.lang.Exception
	{
        MathOperation m=new MathOperation();
        
    System.out.println(MathOperation.add(12,24));   
      System.out.println(MathOperation.substract(12,24));   
        System.out.println(MathOperation.multiply(12,24));   
          System.out.println(MathOperation.power(12,2));   
    

	}
}
