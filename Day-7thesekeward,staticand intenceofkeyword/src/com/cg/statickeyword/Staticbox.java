package com.cg.statickeyword;

public class Staticbox {
    double width;
	double height;
	static int count;
	Staticbox(int width,int height)
	{ 
		this.width=width;
		this.height=height;
	}
	Staticbox()
	{
		super();
		int cnt=0;
		cnt++;
		System.out.println("the cnt is: "+cnt);//1
		count=15;
		count++;
		System.out.println("the count is: "+count);//16
		
		
	}
	

	public static void main(String[] args) {
		 //Staticbox s=new Staticbox(11,12);
		 Staticbox s=new Staticbox();
		 System.out.println(s.width);
		 

	}

}
