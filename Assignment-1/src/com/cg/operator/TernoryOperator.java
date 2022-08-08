package com.cg.operator;

import java.util.Scanner;

public class TernoryOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		String res=(a%b==0)?"even":"odd";
		System.out.println(res);
		s.close();

	}

}
