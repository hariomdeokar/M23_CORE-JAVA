package com.cg.finalkeyword;
//if any class is final we cannot 
class car
{
	String name;
	//final method can be inherit but cannot be override
	final void print(String name)
	{
		System.out.println("I am driving car");
				
	}
}
class Audi extends car
{
	
}
public class FinalinheritanceMethod {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.print("Audi");

	}

}
