package com;

import java.io.FileOutputStream;

public class ByteDemo {
	
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos=new FileOutputStream("d:/cts.txt",true);
			
			String msg="Anothetr Text added";
			
			byte[] b= msg.getBytes();
			for(byte t:b) {
				System.out.println((char)t+"-> "+t);
				fos.write((int)t);
			}
			
			//fos.write(b);
			
			
			
			System.out.println("-- Writing is done...");
			
			fos.close();
			
			
			
		} catch (Exception e) {
			System.out.println("--- Failed Due to "+e);
		}
		
	}

}
