package com.cg.these;
class B
{
	public void accept1(B b)
	{
		System.out.println("Accept method");
	}
	public void accept2()
	{
		accept1(this);
		
	}
}

public class AurgumentFormethodcall {

	public static void main(String[] args) {
		B b=new B();
		b.accept1(b);
				

	}

}
