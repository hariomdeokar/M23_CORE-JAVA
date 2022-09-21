package com.cg.annotation;
//@Override annotations is giving the extra information about the method
class car
{
	public void speed(int s)
	{
		System.out.println("Speed is :" +s+"Km/hr");
	} 
}
class BMW extends car
{
	@Override
	public void speed(int str)
	{
		System.out.println("Speed is :" +str+"Km/hr");
	} 
}

public class OverrideAnnotation {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.speed(80);

	}

}
