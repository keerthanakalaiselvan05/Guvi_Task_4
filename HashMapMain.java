package com.guvi.task4;
public class HashMapMain {
	public static void main(String[] args) {
        //calling methods
		HashMapStudent hash=new HashMapStudent();
		hash.addStudent();
		hash.displayStudent();
		hash.removeStudent();
		hash.displayStudent();
	}
}
/*
Output:
Enter number of inputs : 
4
Enter Student 1 Name and Grade 
Bubloo
100
Enter Student 2 Name and Grade 
Keerthana
95
Enter Student 3 Name and Grade 
Aaradhya
98
Enter Student 4 Name and Grade 
Krithik
96
{Krithik=96, Bubloo=100, Aaradhya=98, Keerthana=95}
Enter key to remove :
Keerthana
{Krithik=96, Bubloo=100, Aaradhya=98}
*/
