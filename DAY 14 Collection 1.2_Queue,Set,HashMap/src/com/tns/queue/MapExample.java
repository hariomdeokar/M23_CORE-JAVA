package com.tns.queue;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> s=new TreeMap<Integer, String>();
		s.put(15,"Hariom");
		s.put(12,null);
		s.remove(12);
		System.out.println(s);
	}

}
