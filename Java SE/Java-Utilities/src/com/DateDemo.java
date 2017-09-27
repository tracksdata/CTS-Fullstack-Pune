package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		// d.getY
		/*
		 * Date d=new Date(); System.out.println(d);
		 * 
		 * 
		 * System.out.println("year: "+(d.getYear()+1900));
		 * System.out.println("Month: "+(d.getMonth()+1));
		 * System.out.println("date: "+d.getDate());
		 */

		Calendar cl = Calendar.getInstance();
		System.out.println(cl.get(Calendar.YEAR));
		System.out.println(cl.get(Calendar.MONTH) + 1);
		System.out.println(cl.get(Calendar.DATE));

		Calendar dob = Calendar.getInstance();
		dob.set(1987, 9 - 1, 27);

		System.out.println("--------------------------");
		System.out.println(dob.get(Calendar.YEAR));
		System.out.println(dob.get(Calendar.MONTH));
		System.out.println(dob.get(Calendar.DATE));

		System.out.println(dob.getTime());

		Date d = new Date();
		d = dob.getTime();
		System.out.println(d);

		SimpleDateFormat sf = new SimpleDateFormat("MM/YYYY/dd");
		System.out.println(sf.format(d));

		String doj = "29-9-2017";

		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");

		try {
			Date dateOfJoin = s.parse(doj);
			System.out.println(dateOfJoin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
