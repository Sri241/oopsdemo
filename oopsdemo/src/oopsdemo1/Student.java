package oopsdemo1;

import java.util.Scanner;

//instance class
public class Student {
	
//define properties/state/variable/attributes
	int rollNumber;
	String name,course;
	float m1,m2,m3,total;
	
	Scanner s=new Scanner(System.in);
	
	//instance methods/actions/function - user defined Functions
	public void inputDetails()
	{
		System.out.println("Enter  Roll No,Name,course:");
        rollNumber=s.nextInt();
        name=s.next();
        course=s.next();
       
        System.out.println("Enter marks of 3 subjects:");
        m1=s.nextFloat();
        m2=s.nextFloat();
        m3=s.nextFloat();
	} //method with return type
	public float calculate()
	{
		total=m1+m2+m3;
		return total;
		
	}
	public void displayDetails()
	{
		System.out.println("*** Student Details *****");
	    System.out.println("Roll No     :"+rollNumber);
	    System.out.println("Name        :"+name);
	    System.out.println("Course      :"+course);
	    System.out.println("Total Marks :"+total);
	    System.out.println("*************");
		
	}
}
