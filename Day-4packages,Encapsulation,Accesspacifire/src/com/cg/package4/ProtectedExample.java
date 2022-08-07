package com.cg.package4;
    class car
    {
    	protected void print()
    	{
    		System.out.println("Hey I am using AccessSpacifire");
    	}
    }
    class bugati extends car
    {
    	
    }

public class ProtectedExample {

	public static void main(String[] args) {
		bugati b=new bugati();
		b.print();

	}

}
