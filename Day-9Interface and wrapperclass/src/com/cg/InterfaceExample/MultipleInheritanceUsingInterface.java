package com.cg.InterfaceExample;
interface Father
{
	void property();
	
}
interface Mother
{
	void love();
}
class Son implements Father,Mother{

	@Override
	public void love() {
		System.out.println("Mother loves to son");
		
	}

	@Override
	public void property() {
		System.out.println("Father gives love and property");
		
	}
	
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Son s=new Son ();
		s.love();
		s.property();

	}

}
