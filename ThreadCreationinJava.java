package com.practice;

public class ThreadCreationinJava extends Thread {
	
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCreationinJava t1 = new ThreadCreationinJava();
		t1.start();

	}

}
