package com.cg.oops;
class pulser
{
	
	int speed;
	String colour;
	pulser()
	{
		System.out.println("welcome to Tns");
	}
	
		
	pulser(int sp, String col)
	{
		speed=sp;
		colour=col;
	}
	
	void display()
	{
		System.out.println("speed is:"+speed+"Km/hr" +" and colour is:"+colour);
		
	}
	
}

public class parameterisedconstructor {

	public static void main(String[] args) {
		pulser p=new pulser(50,"black");
		pulser x=new pulser();
		p.display();
		
	
		
		
	}

}
