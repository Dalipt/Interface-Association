package com.Interface;

interface cal
{
	//Interface allow us to achieve 100% abstraction
	//Interface can use to specify our requirement which allow standargation
	//We cannot create object/instance and interface 
	//We can write reference of implement to achieve polymorphism
	//An interface can have implemented by multiple class
	//If we declare or not by default interface are public and abstract
	//A class extends one class and then implements multiple interface but first extend
	void add(int a, int b);
	public abstract void sub(int c, int d);
	void addition();
}
interface cal1
{
	void mul(int a, int b);
	public abstract void div(int c, int d);
}

class MyCal implements cal,cal1
{
	//We can't reduce visibility of overridden method
	public void add(int a, int b) {
		int res=a+b;
		System.out.println(res);
		
	}
	public void sub(int c, int d) {
		int f=c-d;
		System.out.println(f);
		
	}
	public void addition()
	{
		
	}
	public void mul(int a, int b)
	{
		int d= a*b;
		System.out.println(d);
	}
	public void div(int c, int d) 
	{
		int r=c/d;
		System.out.println(r);
	}
	
}
class MyCal1 implements cal
{
	public void add(int a, int b)
	{
		int num1=a;
		int num2=b;
		int result=num1+num2;
		System.out.println(result);
	}
	public void sub(double e, int d)
	{
		double sub=e-d;
		System.out.println(sub);
	}
	public void sub(int c, int d) {
		
		
	}
	@Override
	public void addition() {
		// TODO Auto-generated method stub
		
	}
}
class Algebra
{
	public void Calc(cal c, int g,int h)
	{
		c.addition();
		c.add(g,h);
		c.sub(g, h);
	}
}
public class Interface {

	public static void main(String[] args) {
		MyCal cl=new MyCal();
		cl.add(23, 44);
		cl.sub(10, 5);
		cl.div(20, 5);
		cl.mul(20, 6);
		
		
		MyCal1 cl1=new MyCal1();
		cl1.add(23, 44); cl1.sub(50.00, 40);
		 Algebra ag= new Algebra();
		 ag.Calc(cl1, 20,5); ag.Calc(cl, 25, 35); 
		 
	}

}
