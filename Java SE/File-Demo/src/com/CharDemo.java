package com;

import java.io.File;
import java.io.FileWriter;

public class CharDemo {

	public static void main(String[] args) {

		try {

			File fileLoc = new File("D:/cts1.txt");

			FileWriter fw = new FileWriter(fileLoc);

			String msg="Text to file";
			
			fw.write(msg);
			
			fw.close();
			
			System.out.println("-- Writing is done");
			
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
