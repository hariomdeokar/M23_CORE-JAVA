package com.cg.inheritance;
class bike
{
	protected int speed;
	void display()
	{
		System.out.println("Il love bikes");
	}
}
class pulsar extends bike
{
	protected String colour;
	void print()
	{
		System.out.println("the speed is:"+speed);
	}
	
}
class pulsar180  extends pulsar
{
	void aceept()
	{
		System.out.println("the colour is:"+colour);
	}
}

public class multiinheritance {

	public static void main(String[] args) {
	   pulsar180 p=new pulsar180();
			   p.display();
	   p.print();
	   p.aceept();

	}

}
