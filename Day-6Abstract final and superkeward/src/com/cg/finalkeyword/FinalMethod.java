package com.cg.finalkeyword;
class A
{
	A()
	{
		System.out.println("constructor");
	}
	//if any method is final the we cannot override it 
	//final void display()
	void display()
	{
		System.out.println("parent Class");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("parent Class");
	}
	
}

public class FinalMethod {

	public static void main(String[] args) {
		B b=new B();
		b.display();

	}

}
