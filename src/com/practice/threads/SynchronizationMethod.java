package com.practice.threads;

public class SynchronizationMethod {

	public static void main(String[] args) {

		final Table obj = new Table();// only one object

		//Anonymous Class
		Thread t1 = new Thread() {
			@Override
			public void run() {
				obj.printTable(5);
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				obj.printTable(100);
			}
		};

		t1.start();
		t2.start();

	}

}

class Table {
	synchronized void printTable(int n) { // method synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}


