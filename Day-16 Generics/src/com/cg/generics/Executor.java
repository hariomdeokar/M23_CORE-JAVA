package com.cg.generics;

public class Executor {

	public static void main(String[] args) {
		
		Sender<String>obj=new Sender<>();
		obj.setMessage("Generics Class Demo");
		obj.sendMessage();
		
		//
		Email em=new Email();
		em.setFrom("hariomdeokar@gmail.com");
		em.setTo("hariomdeokae09@gmail.com");
		em.setSubject("Java Training and placement");
		em.setBody("About Training and placement");
		System.out.println(em.getBody());
		
		
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);
		
		
	}

}
