package com.cg.these;
class x
{
	int m1, m2;
	public void print(int m1,int m2)
	{
		this.m1=m1;
	    this.m2=m2;
	}
	public void display()
	{
		System.out.println("Adition of m1 and m2 ia:"+(m1+m2));
	}
}

public class Instancevariable {

	public static void main(String[] args) {
		x obj=new x();
		obj.print(11,12);
		obj.display();

	}

}
