package com.cg.polymorphism;
//Program on method overloading
class Shape
{
	int area(int a)
	{
		return a*a;
	}
	int area(int a,int b)
	{
		return a*b;
	}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Shape s=new Shape();
		System.out.println(s.area(5));
		System.out.println(s.area(10,20));

	}

}
