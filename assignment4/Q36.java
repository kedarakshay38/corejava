
import java.util.*;
import java.lang.*;
import java.io.*;

class Student{
    private int rollno;
    private String name;
   static int c=0;
   Student(){c++;
    
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
	Student s3=new Student();
	Student s4=new Student();
	System.out.println(Student.c);
	}
}