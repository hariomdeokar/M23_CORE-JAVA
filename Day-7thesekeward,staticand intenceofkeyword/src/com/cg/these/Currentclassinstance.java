package com.cg.these;
class Main
{
	public int x, y;
	Main()
	{
		x=10;
		y=20;		
	}
	Main get()
	{
		return this;
	}
	public void display()
	{
		System.out.println("Multipication of x and y is:"+(x*y));
	}
}

public class Currentclassinstance {

	public static void main(String[] args) {
		Main m=new Main();
		m.get().display();
;
		
	}

}
