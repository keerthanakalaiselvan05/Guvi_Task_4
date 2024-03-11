package com.guvi.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapStudent {
	 //map to store key-value pair
	  Map<String,Integer> hashmap= new HashMap<>();
	  Scanner sc=new Scanner(System.in);
     //method to add a student details
	  public void addStudent()
	  {
	  System.out.println("Enter number of inputs : ");
	  int input=sc.nextInt();
      for(int i=1;i<=input;i++)
      {
    	  System.out.println("Enter Student "+ i + " Name and Grade ");
    	  String key=sc.next();
    	  int value=sc.nextInt();
    	  hashmap.put(key, value);
      }
      }
	  //method to remove a student details
	  public void removeStudent()
	  {
		  System.out.println("Enter key to remove :");
		  String keytoRemove=sc.next();
		  hashmap.remove(keytoRemove);
	  }
	  //method to display a student details
	  public void displayStudent()
	  {
		  System.out.println(hashmap);
	  }
}
