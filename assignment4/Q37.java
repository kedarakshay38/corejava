/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Student{
    private int rollno;
    private String name;
      
      Student(){
            this(12,"Anamika");
            System.out.println("inside parameterless constructor");
      }
      
      Student(int a,String s){
            this.rollno=a;
            this.name=s;
            System.out.println("inside parameterise constructor");
      }
      
    
    void setData(int rollno,String name){
          this.rollno=rollno;
          this.name=name;
    }
    
    void show(){
          System.out.println("rollno="+rollno+" "+"name="+name);
    }
}


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Student s=new Student();
	s.setData(112,"Akshay");
	s.show();
	Student s2=new Student();
		s2.show();
	Student s3=new Student();
		s3.show();
	Student s4=new Student();
		s4.show();
	
	}
}