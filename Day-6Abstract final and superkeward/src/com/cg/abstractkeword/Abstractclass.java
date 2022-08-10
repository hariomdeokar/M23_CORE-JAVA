package com.cg.abstractkeword;
abstract class Flower
{
	abstract void print();
	
	void display()
	{
		System.out.println("Demo on Abstract keyword");
	}
}
class Rose extends Flower
{
	
    public void print()
    {
	System.out.println("i like rose");
    }
}

public class Abstractclass {
	

	public static void main(String[] args) {
		Rose r=new Rose();
		r.print();
		r.display();
	
	}

}
