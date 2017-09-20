package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Abc {
	public static void main(String[] args) {
		Date d=new Date();
		
		Calendar cl=Calendar.getInstance();

		
		//String str="23/09/2012";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		//sdf.format(d);
		System.out.println(sdf.format(d));
		/*Date date=null;
		try {
			date=sdf.parse(str);
			System.out.println("Date: "+date);
			System.out.println(sdf.format(date));
		} catch (Exception e) {
			System.out.println("failed due to "+e);
		}*/
		
		
	}

}
