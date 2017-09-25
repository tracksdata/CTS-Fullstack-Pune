package com;

import java.util.Scanner;

public class Demo extends Thread {

	@Override
	public void run() {

		fun();
	}

	void fun() {

		String tname = Thread.currentThread().getName();
		if (tname.equals("First")) {
			try {
				System.out.println(tname + " is Sleeping for 5 secs");
				Thread.sleep(5000);
				System.out.println(tname + " is resumed from sleep");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 1; i <= 10; i++) {

			System.out.println("I = " + i + " By " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Entet a String: ");
		String s1=sc.nextLine();
		Demo d1 = new Demo();

		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);

		t1.setName("First");
		t2.setName("Second");

		/*
		 * t1.setPriority(MAX_PRIORITY); t2.setPriority(MAX_PRIORITY);
		 */
		t1.start();
		t2.start();

		/*
		 * d1.fun(); d2.fun();
		 */

	}

}
