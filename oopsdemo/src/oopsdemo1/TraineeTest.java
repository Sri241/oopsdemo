package oopsdemo1;

public class TraineeTest {
     
	public static void main(String[] args) {
		
		Trainee t1=new Trainee();  //invokes implicit constructor
		t1.display();  
		
		//invokes parameterized Constructor
		Trainee t2=new Trainee(222,"Rod Jhonson","Spring",7000);
		t2.display();
		
		Trainee t3=new Trainee(333,"Sri Lakshmi","Sault",8000);
		t3.display();
	}
}
