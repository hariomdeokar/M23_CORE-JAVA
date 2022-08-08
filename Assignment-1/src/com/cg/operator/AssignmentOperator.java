package com.cg.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int x=s.nextInt();
	    int y=s.nextInt();
	    int res=x=y;
	    int res1=x*=y;
	    int res2=x+=y;
	    int res3=x-=y;
	    int res4=x/=y;
	    int res5=x%=y;
	    System.out.println(res);
	    System.out.println(res1);
	    System.out.println(res2);
	    System.out.println(res3);
	    System.out.println(res4);
	    System.out.println(res5);
	    s.close();
	    

	}

}
