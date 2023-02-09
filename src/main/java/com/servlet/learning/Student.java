package com.servlet.learning;

public class Student {
	   String name;
	   int rollNo;
	   String block;
	   
	   public Student(){
		 
	   }
	   
	   Student(String name,int RollNo,String block){
		   this.name=name;
		   this.rollNo=rollNo;
		   this.block=block;
	   }
	   
	  
	   
	   public void display()
	   {
	      Student[] studentArray = {new Student("Joe",1,"A"),new Student("Larry",2,"B")};
	      System.out.println(studentArray[0]);
	      
	   }
	   
	   
	}

