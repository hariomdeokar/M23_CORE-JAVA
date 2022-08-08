package com.cg.looping;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n<=10)
		{
			System.out.println(n);
			n++;
			s.close();
		}

	}

}
