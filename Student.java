package com.guvi.task4;

public class Student {
	private String name;
	private String course;
	private int rollno;
	private int age;
//constructor
	public Student(String name, String course, int rollno, int age) {
		super();
		this.name = name;
		this.course = course;
		this.rollno = rollno;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//method to show AgeNotWithinRangeException
	public void showAge() throws AgeNotWithinRangeException
	{
		if(age<15 || age >21)
		{
			throw new AgeNotWithinRangeException("Given age is not within the range...");
		}
		else
		{
			System.out.println("No exception found-Age is within the range...");
		}
	}
	//method to show NameNotValidException
	public void showName() throws NameNotValidException
	{
		int len=name.length();
        for(int i=0;i<len;i++)
        {
        if(Character.isLetterOrDigit(name.charAt(i))==false)
        {
	        throw new NameNotValidException("Name contains numbers or special characters...");
        }
        }
        	System.out.println("No exception found-Name contains alphabets only...");
	}
}
