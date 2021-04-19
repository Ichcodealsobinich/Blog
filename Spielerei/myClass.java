package com.wildodeschool;

public class myClass {
	public static void main(String[] args) {
		System.out.println("Sie haben " + args.length + " Parameter mitgegeben");
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			} // End of for
		} //End of if 
	} // End of main
} //End of class
