package com.practice;
//import java.io.*;
public class ExceptionInOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.message();
		a.getmsg();
		
		C c = new C();
		c.message();
		c.getmsg();
		

	}

}

class A{
	
	void message() {
		System.out.println("Parent class method 1");
	}
	
	void getmsg() {
		System.out.println("Parent class method 2");
	}
	
}

class B extends A{
	void message() //throws IOException
	{
		System.out.println("Child class method 1");
	}
	
	void getmsg() throws ArithmeticException{
		System.out.println("Child class method 2");
	}
}

class C{
	void message() throws ArithmeticException{
		System.out.println("parent class method");
	}
	void getmsg() throws RuntimeException {
		System.out.println("Parent class method 2");
	}
}

class D extends C{
	void message() //throws Exception
	{
		System.out.println("Child class method");
	}
	void getmsg() throws RuntimeException, ArithmeticException {
		System.out.println("Child class method 2");
	}
}
