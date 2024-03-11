package com.guvi.task4;

import java.util.Scanner;

public class StudentException {

	public static void main(String[] args) {
        //getting input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Namee :");
        String name=sc.next();
        System.out.println("Enter Course :");
        String course=sc.next();
        System.out.println("Enter RollNo :");
        int rollno=sc.nextInt();
        System.out.println("Enter Age :");
        int age=sc.nextInt();	
        Student student=new Student(name,course,rollno,age);
        System.out.println("Name: "+student.getName()+" || "+"Course: "+student.getCourse()+" || "+"RollNo: "+student.getRollno()+" || "+"Age: "+student.getAge());
		//try-catch block to handle the exception
        try {      
             student.showAge();
		 } 
        catch(AgeNotWithinRangeException e)
		{
			System.out.println("AgeNotWithinRange Exception caught : "+e.getMessage());
		}
		try {
			student.showName();
		}
		catch(NameNotValidException e)
		{
			System.out.println("NameNotValid Exception caught : "+e.getMessage());	
		}
		}
	}

/*output:
	
	    Enter Namee:
		Keerthu@12
		Enter Course :
		CSE
		Enter RollNo :
		9612
		Enter Age :
		22
		Name: Keerthu@12 || Course: CSE || RollNo: 9612 || Age: 22
		AgeNotWithinRange Exception caught : Given age is not within the range...
		NameNotValid Exception caught : Name contains numbers or special characters...
*/