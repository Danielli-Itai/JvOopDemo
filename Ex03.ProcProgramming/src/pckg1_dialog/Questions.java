package pckg1_dialog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





public class Questions {
	private static void print(String message) {
		System.out.print(message +System.lineSeparator());
		return;
	}

	
	public static String WhatIs(String question) throws IOException {
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
		
		print("Waht is " + question+"?"+System.lineSeparator());
		String input = reader.readLine();
		return(input);
	}
}
