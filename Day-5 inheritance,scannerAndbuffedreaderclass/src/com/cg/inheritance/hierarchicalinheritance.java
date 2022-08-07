package com.cg.inheritance;
class android
{
	void display()
	{
		System.out.println("android");
	}
}
class kitkat extends android
{
	void print()
	{
	System.out.println("kitkat");
	}
}
class pie
{
	void accept()
	{
		System.out.println("pie");
	}
}

public class hierarchicalinheritance {

	public static void main(String[] args) {
		kitkat k=new kitkat();
		pie p=new pie();
		k.display();
		k.print();
		p.accept();

	}

}
