package com.cg.these;
class z
{
	int a;
	 z()
	{
		 this(10);
		 System.out.println("Default constructor");
		
	}
	 z(int a)
	 {
		 System.out.println("Value is:"+a);
	 }
}

public class InvokConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		z obj=new z();
		

	}

}
