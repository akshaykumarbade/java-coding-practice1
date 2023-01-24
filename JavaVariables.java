package com.practice;

public class JavaVariables {
	static int c = 4;
	static String st = "static variable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariables obj = new InstanceVariables();
		
		obj.get();
		System.out.println(c+ " "+ st);
		

	}

}

class InstanceVariables {
	 int a = 10;
	 String str = "Instance variable";
	 
	 
	 void get() {
		 int b = 9;
		 String s = "local variable";
		 System.out.println(a+" "+str);
		 System.out.println(b+" "+s);
	 }
}
