package com.cg.oops;

import java.util.Scanner;

class vehicle
{
	int a;
	void display()
	{
		System.out.println("welcome to M23");
	}
}




public class RuntimeClassAndObjectProgram {

	public static void main(String[] args) {
		vehicle ob=new vehicle();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a:");
		ob.a=s.nextInt();
		ob.display();
		System.out.println(ob.a);
		

	}

}
