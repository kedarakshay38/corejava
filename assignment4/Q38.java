import java.util.*;
import java.lang.*;
import java.io.*;

 class circle{
      private double radious;
      private double ar;
      
       void Init(int a){
            this.radious=a;
      }
      
       double calculateArea(){
       return ar=3.14*radious*radious;
      }
      
      void display(){
      System.out.println(calculateArea());
      System.out.println(radious);
      }
      

 }