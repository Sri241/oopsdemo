package oopsdemo2;

public class OverloadDemo {
	
	public static void main(String[] args) {
		
		Addition a1=new Addition();
		
		//invoking add() overload method
		a1.add();
		a1.add(20,30);
		a1.add(34.45f,542.67f);//type promotion will happen
		a1.add(300,500,100);
		a1.add("Hello", "World");
		
		//a1.add(10);
	}

}
