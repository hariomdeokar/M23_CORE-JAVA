package com.cg.desigionmaking;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("what is your age:");
		int age=s.nextInt();
		System.out.println("what is your weight:");
		int weight=s.nextInt();
		s.close();
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110)
				{
				    System.out.println("you are eligible for bunjeejumping");
				}
				else
				{	
					System.out.println("extra ropes will be added");
				}
					
			}
			else
			{
				System.out.println("you are not eligible for bunjeejumping");
			}
		}
		else
		{
			System.out.println("you are not eligible for bunjeejumping");
		}

	}

}
