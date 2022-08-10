package com.cg.assingmentque3;

import java.util.Scanner;

public class Question3 
{  
    public static void pyramidPattern(int n) 
    {  
    	   int i,j;
        for ( i=0; i<n; i++)
        { 
                System.out.print("\n"); 
            for (j=0; j<=i; j++ ) 
            { 
                System.out.print("*");
            } 
  
        } 
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		pyramidPattern(n);
		s.close();
		
		
		
		

	}

}
