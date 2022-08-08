package com.cg.desigionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.close();
		switch (a)
		{
		case 1:
			System.out.println("Rohit");
			break;
		case 2:
			System.out.println("Kalpesh");
			break;
		case 3:
			System.out.println("Aman");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
