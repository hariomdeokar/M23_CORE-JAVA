package com.cg.these;
class A
{
	public int num;
	A()
	{
		System.out.println("wlecome to M23");
	}
	A(int num)
	{
		this.num=num;
	}
}

public class Instanceconstrucor {

	public static void main(String[] args) {
		A a=new A();
		A b=new A(5);
		System.out.println(b.num);

	}

}
