package com.cg.statickeyword;

public class StaticBlock {
	static int a;
	static String name;
	/*StaticBlock(int a,String name)
	{
		this.a=a;
		this.name=name;
		
	}*/
	//Static block
	static
	{
		a=35;
		name="java";
	}

	public static void main(String[] args) {
		//StaticBlock s=new StaticBlock(a, name);
		//s.a=35;
		//name="java";
		System.out.println(a);
		System.out.println(name);
		
		

	}

}
