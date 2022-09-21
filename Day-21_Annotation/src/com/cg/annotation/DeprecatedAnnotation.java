package com.cg.annotation;
class A
{
	@Deprecated
	public void print()
	{
		System.out.println("wlecome to TNS");
	}

}

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		A a=new A();
		a.print();

	}

}
