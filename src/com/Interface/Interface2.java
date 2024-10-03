package com.Interface;
//From java 8 interface can have body
/*An interface implementing class can have specilize own methods also but we 
can't access it with parent reference we need downcasting to use it
*/
//Interface if not extend any class that mean interface not extends Object class
interface Training
{
	void show();
	default void display()
	{
	 System.out.println("FromJava 8 this feature comes");
	}
	//From Java 8 Static method is allowed but its must contain a body
	//Static method in interface must not be abstract 
	//An static method have not get implemented in implementing class
	static void innowkno()
	{
		System.out.println("Static method from Java 8.0");
	}
}
class Testing implements Training
{
	//Its not compulsory to override default method of interface
	//If required we can override it
	public void show()
	{
		System.out.println("This is overriden method of interface");
	}
	public void display()
	{
		System.out.println("FromJava 8 this feature comes");
	}
	
}

public class Interface2 {

	public static void main(String[] args)
	{
		Testing t= new Testing();
		Training.innowkno();//Because its static we can use it with class or interface reference
		t.display();
		t.show();
	}

}
