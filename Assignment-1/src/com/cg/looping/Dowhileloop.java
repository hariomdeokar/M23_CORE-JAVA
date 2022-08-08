package com.cg.looping;

import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		do
		{
			System.out.println("the value of d is:" + d);
			d++;
		}while(d<30);
		s.close();
		

	}

}
