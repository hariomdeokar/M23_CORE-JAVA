package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(1001,"Hariom Deokar ",500, true);
		NormalAcc n=new GSNormalAcc(1002,"Rohit Satav ",500, 50);
		System.out.println("Prime Account: ");
		p.bookProduct(500);
		
		System.out.println("Normal Account: ");
		n.bookProduct(500);
		
		
		System.out.println(p);
		System.out.println(n);



		

	}

}
