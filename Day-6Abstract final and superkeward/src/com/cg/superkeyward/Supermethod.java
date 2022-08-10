package com.cg.superkeyward;
class A
{
	public int pin;
	public void display(int pin)
	{
		System.out.println("Pin is:"+pin);
	}
}
class B extends A
{
	public int pin;
	public void display(int pin)
	{
		System.out.println("Pin is:"+pin);
	}
	void print()
	{
		display(9980);
		super.display(4451);
	}
	
}

public class Supermethod {

	public static void main(String[] args) {
		B b=new B();
		b.print();
		

	}

}
