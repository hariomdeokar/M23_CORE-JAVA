package com.cg.superkeyward;

class colour
{
     protected String name="orange";
	
	
}
class Blue extends colour
{
    public String name="Blue";
	public void display()
	{
		System.out.println(name);
		//super keyword is use to refer the parent class variable 
		System.out.println(super.name);
	}
	
}


public class Supervairiable {

	public static void main(String[] args) {
		Blue b=new Blue();
		b.display();
		

	}

}
