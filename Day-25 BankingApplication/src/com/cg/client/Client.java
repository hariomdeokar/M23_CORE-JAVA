package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1001,"Hariom Deokar ",2000, true);
		CurrentAcc c=new MMCurrentAcc(1002,"Rohit Satav ",1000, 500);
		System.out.println("Saving Account: ");
		s.withdrawal(2100);
		
		System.out.println("Current Account: ");
		c.withdrawal(600);
		
		
		System.out.println(s);
		System.out.println(c);

	}

}
