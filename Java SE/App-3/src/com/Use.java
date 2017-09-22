package com;

public class Use {

	public static void main(String[] args) {

	System.out.println("--- Welcome ");
		try {
			int x=10;

			Class clsName= Class.forName("com.Oracle");

			Object obj= clsName.newInstance();
			
		    if(obj instanceof Oracle) {
		    	Oracle ora= (Oracle)obj;
		    	ora.oraInfo();
		    }
			
		    if(obj instanceof MySQL) {
		    	MySQL ms= (MySQL)obj;
		    	ms.mySQLInfo();
		    }
		    
		    
		    if(obj instanceof Sybase) {
		    	Sybase sb= (Sybase) obj;
		    }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
