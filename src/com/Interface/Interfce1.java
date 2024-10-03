package com.Interface;
//An interface cannot implement another interface 
//An interface can extends another interface
//There is no constructor in interface
interface Demo
{
	void display();
	float pi=3.24f;//By default all variables are public static and final
	static float pii=2.0f;
}
interface Demo2 extends Demo
{
	void show();
}
class Alpha implements Demo2
{

	public void display()
	{
		System.out.println("Display method");
	}
	public void show()
	{
		System.out.println("Show method");	
	}
	
}
public class Interfce1 {

	public static void main(String[] args)
	{
		Demo d= new Alpha();
		d.display();
		//Accessing variable of interface
		//float pi = Demo.pi;
		
		
		Demo2 dm= new Alpha();
		dm.display();
		dm.show();
		

	}

}
