package com;

class Reservation extends Thread {

	int noOfSeats = 2;
	int wanted;

	public Reservation(int wanted) {

		this.wanted = wanted;
	}

	@Override
	public void run() {

		bookTicket();

	}

	public void bookTicket() {

		String tname = Thread.currentThread().getName();
		System.out.println("Number Available Seats are " + noOfSeats);

		synchronized (this) {
			
		}
		//-----
		synchronized (this) {
			
		}
		
		synchronized (this) {

			if (noOfSeats >= wanted) {
				System.out.println("Trying to Book " + wanted + " seats to " + tname);

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				noOfSeats = noOfSeats - wanted;
				System.out.println(wanted + " seats Booked to " + tname);

			} else {
				System.out.println("No Seats are available");
			}

		}
	}// end of block

}

public class Passenger {

	public static void main(String[] args) {

		Reservation r = new Reservation(1);

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.setName("Passenger-1");
		t2.setName("Passenger-2");
		t1.start();
		t2.start();

	}

}
