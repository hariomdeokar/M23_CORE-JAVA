package com.cg.scannerbuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bufferreaderexample {

	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String str=b.readLine();
		System.out.println(str);

	}

}
