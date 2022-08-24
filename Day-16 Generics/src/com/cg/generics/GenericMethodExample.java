package com.cg.generics;

public class GenericMethodExample
{
	public static <E>void printArray(E[] elem)
	{
		for(E itr:elem)
		{
			System.out.println(itr.getClass().getName());
			System.out.println(itr);
		}
	}
	

	public static void main(String[] args) {
		Integer[] arr1= {10,20,30};
		Character []arr2= {'z','s','r'};
		System.out.println("Printing array for Charector");
		printArray(arr1);
		System.out.println("Printing array for Integer");
		printArray(arr2);

	}

}
