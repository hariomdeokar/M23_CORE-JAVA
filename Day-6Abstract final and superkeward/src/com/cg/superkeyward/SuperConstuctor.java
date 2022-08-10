package com.cg.superkeyward;
class Android
{
	Android()
	{
		System.out.println("Lava is android mob");
	}
}
class Lava extends Android
{
	Lava()
	{
		super();
	    System.out.println("Lava is Indian company");
	}
}

public class SuperConstuctor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Lava l=new Lava();
		
		

	}

}
