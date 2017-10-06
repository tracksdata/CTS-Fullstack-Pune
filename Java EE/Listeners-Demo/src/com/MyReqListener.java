package com;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class MyReqListener
 *
 */
public class MyReqListener implements ServletRequestListener {

	private static int count=0;
	
	public MyReqListener() {
		System.out.println("---- requestListener Object Created");
	}

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("--- request destroyed");
	}

	public void requestInitialized(ServletRequestEvent sre) {

		count++;
		
		ServletRequest request= sre.getServletRequest();
		request.setAttribute("pageCount", count);
		
		
		
		System.out.println("----- new request created.....");

	}

}
