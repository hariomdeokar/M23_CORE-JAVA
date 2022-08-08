package com.tns.recursion;

import java.util.Scanner;

public class Assingmentque1 {
	static int fibo(int n)
	{
		if (n <= 1)
		    return n;
		else
			return fibo(n-1) + fibo(n-2);
		

	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fibo(6));
		s.close();

	}

}
