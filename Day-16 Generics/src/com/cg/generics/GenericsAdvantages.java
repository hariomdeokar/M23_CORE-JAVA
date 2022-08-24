package com.cg.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantages {

	public static void main(String[] args) {
	    List<Integer> obj=new LinkedList<>();
	    obj.add(12);
	    //Type Safety
	    //obj.add("hariom");
	    
	    System.out.println(obj);
	    //2.Type cast is not require
	    List<Integer> obj2=new ArrayList<>();
	    obj2.add(15);
	    
	    //compile time checking
	    //obj2.add("15");
	    
	    Integer d=obj2.get(0);
	    System.out.println(obj2);

	}

}
