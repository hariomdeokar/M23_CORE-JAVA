package com.cg.polymorphism;
class Triber
{
	int speed;
	String engine;
	//zero parameter
	Triber()
	{
		System.out.println("Renault-Triber");
	}
	
	//two parameter
	Triber(int speed, String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is: "+speed+"km/hr" +" and engine is on: "+engine);
		
	}
}

public class ConstructorOverloading {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Triber t=new Triber();
		Triber t1=new Triber(45,"Disel");

	}

}
