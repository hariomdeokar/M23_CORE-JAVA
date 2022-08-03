package com.cg.oops;
//demo on how to create class and object
class car
{
	//variable
	int a;
	//user define method
	void display()
	{
		System.out.println("wlcome to M23");
	}
}

public class ProgramOnClassAndObject {

	public static void main(String[] args) {
		//object creation
	      car obj=new car();
	      //accessing the car class
	      obj.display();
	      obj.a=15;
	      //accessing the car class variable
	      System.out.println(obj.a);
	    		  

	}

}
