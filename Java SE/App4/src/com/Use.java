package com;

import java.util.Scanner;

public class Use {

	public static void main(String[] args) {

		/*
		 * Circle c=new Circle(); c.copyRights();
		 */

		/*
		 * Issues ------- 1. No Abstraction here : can invoke all methods on top of
		 * child
		 * 
		 */

		// Best Solution

		Shape s;
		Scanner sc = new Scanner(System.in);
		System.out.println("provide a class: ");
		String cname = sc.nextLine();

		try {
			Class cl = Class.forName(cname);

			Object obj = cl.newInstance();

			s = (Shape) obj;
			s.draw();

		} catch (Exception e) {
			// TODO: handle exception
		}

		//s=new Circle();
		//s=new Shape();
		// s.disply();
		// s.draw();
		// s.copyRights();

		// s.circleInfo(); --> abstraction

	}
}
