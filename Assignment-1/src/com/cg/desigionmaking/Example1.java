package com.cg.desigionmaking;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		if (a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}

	}

}
