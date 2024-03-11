package com.guvi.task4;
import java.lang.Exception;
import java.util.Scanner;
public class Voter {

	private String voterID;
	private String name;
	private int age;
    //parameterized constructor
	public Voter(String voterID,String name,int age)
		{
		this.voterID=voterID;
		this.name=name;
		this.age=age;
	        show();
		}
	//try-catch block to handle the Invalid age exception
	       public void show()
		{
		try {
		if(age<18)
		{
			throw new Exception("Invalid age for Voter...");
		}
		else
		{
			System.out.println("Valid age for User to Vote...");
		}
		}catch(Exception e)
		{
			System.out.println("InValidAge Exception caught : "+e.getMessage());
		}
		}
	       public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the VoterID : ");
		String voterID=sc.next();
		System.out.println("Enter the Name : ");
		String name=sc.next();
		System.out.println("Enter the Age : ");
		int age=sc.nextInt();
		Voter vote=new Voter(voterID,name,age);
	}
}

/*
 
output:

Enter the VoterID : 
YCV0164822
Enter the Name : 
Keerthana
Enter the Age : 
17
InValidAge Exception caught : Invalid age for Voter...

*/
