package com.practice.threads;

public class ThreadExample {

	public static void main(String[] args) {

		ThreadOne t1 = new ThreadOne();
		t1.start();

		ThreadTwo t2 = new ThreadTwo();
		t2.start();

	}

}

class ThreadOne extends Thread {

	public void run() {
		for(int i=0; i<=100; i++) {
			System.out.println(i);
		}
	}

}

class ThreadTwo extends Thread {

	public void run() {
		for(int i=200; i<=300; i++) {
			System.out.println(i);
		}
	}

}
