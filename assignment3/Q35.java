/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Student{
    private int rollno;
    private String name;
    static void setData(int rollno,String name){
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
	Student.setData(112,"Akshay");
	s.show();
	}
}