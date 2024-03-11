package com.guvi.task4;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		String[] array= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the day position : ");
		int position=sc.nextInt();
		//try-catch block to handle the exception
	        try {
		for(int i=0;i<array.length;i++)
	        {
		  if(position==i)
		  {
	        System.out.println("Day Name is : "+array[i]);
	        }
		  else if(position>=array.length)
		  {
	   	   throw new ArrayIndexOutOfBoundsException("Index is out of range...");	
		  }
	        }
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			System.out.println("Exception caught : "+e.getMessage());
		 }
	}
}

/*

Output:
Enter the day position : 
8
Exception caught : Index is out of range...

*/
