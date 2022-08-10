package com.cg.finalkeyword;
//if class is declare as final we cannot inherit it
//final class Fruit
class Fruit
{
	//we cannot make any constructor as final
	//final fruit()
	Fruit()
	{
		System.out.println("constructor");
	}
	
	void display()
	{
		System.out.println("parent Class");
	}
}
class Apple extends Fruit
{
	void display()
	{
		System.out.println("parent Class");
	}
	
}


public class FinalClass {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.display();

	}

}
