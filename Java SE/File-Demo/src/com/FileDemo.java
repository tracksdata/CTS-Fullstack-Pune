package com;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		try {

			File file = new File("d:/f3/t1.txt");
			//file.mkdir();
			
			file.createNewFile();
			

			System.out.println("Done");

		} catch (Exception e) {
			System.out.println("-- failed due to "+e);
		}
	}

}
