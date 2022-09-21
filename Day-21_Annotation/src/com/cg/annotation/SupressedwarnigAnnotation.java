package com.cg.annotation;
class Animal
{
	Animal()
	{
		System.out.println("Lion");
		
	}
	public void sound()
	{
		System.out.println("Roar");
	}
}

public class SupressedwarnigAnnotation {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Animal a=new Animal();

	}

}
