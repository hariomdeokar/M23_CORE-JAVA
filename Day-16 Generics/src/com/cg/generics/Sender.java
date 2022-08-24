package com.cg.generics;

public class Sender <T>
{
	private T message;
    //getter method
	public T getMessage() {
		return message;
	}
    //setter method
	public void setMessage(T messege) {
		this.message = messege;
	}
    public void sendMessage()
    {
    	System.out.println("Message Type: "+getMessage().getClass());
    	System.out.println("Contents are: "+getMessage());
    }
}
