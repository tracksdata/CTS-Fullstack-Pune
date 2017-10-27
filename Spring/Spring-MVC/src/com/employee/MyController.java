package com.employee;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/abc.htm")
	public void  test() {
		
		System.out.println("--- MyController test method...");
		
	}
	
	
	@RequestMapping("/xyz.htm")
	public String  test1() {
		
		System.out.println("--- MyController test1 method...");
		//----
	
		return "two";
	}
	
	@RequestMapping("/test.htm")
	public String  test2(Model myObj) {
		 
		
		String name="Praveen";
		
		myObj.addAttribute("mn", name);
		
		System.out.println("--- MyController test2 method...");
		//----
	
		return "one";
	}
	
	
	
	
	
	@RequestMapping("/welcome.htm")
	public ModelAndView  test3() {
		 
		ModelAndView mav=new ModelAndView();
		mav.addObject("city", "Pune");
		mav.addObject("name", "Praveen");
		
		// set a view too
		mav.setViewName("thr");
		
		
		
		System.out.println("--- MyController test3 method...");
		//----
	
		return mav;
	}
	
	
	

}
