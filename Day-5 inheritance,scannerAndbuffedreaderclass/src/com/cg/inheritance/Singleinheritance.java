package com.cg.inheritance;
class parents
{
	protected int rollno;
	void print()
	{
		System.out.println("hello guys");
	}
}
class child extends parents
{
	void accept()
	{
		System.out.println("roll no is:"+rollno);
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		child c=new child();
		c.rollno=21;
		c.accept();
		c.print();
				

	}

}
