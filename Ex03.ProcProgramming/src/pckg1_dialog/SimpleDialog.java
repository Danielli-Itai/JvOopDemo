package pckg1_dialog;

import java.io.IOException;





public class SimpleDialog {
	// //Prints Hello World!
	public static void main (String[] args) throws IOException
	{
		Messages.Hello("There");
		String name = Questions.WhatIs("Your name");
		Messages.NiceToMeet(name);
		Messages.Goodbye(name);
		
		return;
	}
}
