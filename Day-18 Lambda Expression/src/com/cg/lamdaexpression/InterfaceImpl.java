package com.cg.lamdaexpression;

interface C
{
	//1.Lambda expression will only work for functional interface implementation not for other interface
	
	//void accept();
	void display();
	
}
public class InterfaceImpl {

	public static void main(String[] args)
	{
		//The target type of this expression must be a functional interface
		C obj=()->
		{
			System.out.println("Functional Interface Implementation using "+ " Lambda expression");
		};
		obj.display();
	}

}
