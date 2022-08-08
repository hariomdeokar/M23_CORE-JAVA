package com.cg.operator;

import java.util.Scanner;

public class Logicaloperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean res= (a>b && b<5);
		boolean res1= (a>b || b<5);
		boolean res2= !(a>b);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		sc.close();
		

	}

}
