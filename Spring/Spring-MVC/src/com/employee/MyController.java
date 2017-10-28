package com.employee;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	
	// form handling
	
	@RequestMapping(value="/saveEmp1",method=RequestMethod.GET)
	public ModelAndView getData(@RequestParam("empId") int eid,@RequestParam("empName")String empName,@RequestParam("salary") double salary) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("empId", eid);
		mav.addObject("empName", empName);
		mav.addObject("salary", salary);
		mav.setViewName("display");
		
		//System.out.println("---- getData  EID: "+eid+" and name is "+empName);
		
		return mav;
		
	}
	
	// form handling_v1
	
	@RequestMapping(value="/saveEmp",method=RequestMethod.POST)
	public ModelAndView empData(@ModelAttribute("cn") Employee emp) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("employee", emp);
		mav.setViewName("disp");
		return mav;
		
	}
	
	// Spring Dynamic Forms
	
	@RequestMapping(value="/loadForm.htm")
	public ModelAndView loadForm(@ModelAttribute("bla")Employee emp) {
		ModelAndView mav=new ModelAndView();
		
		
		
		emp.setEmpId(10);
		emp.setEmpName("James");
		emp.setSalary(39734343);
		
		String[] cities= {"Hyderabad","Chennai","Pune","Delhi","Jaipur","Bangalore"};
		
		
		mav.addObject("emp", emp);
		mav.addObject("cities", cities);
		
		mav.setViewName("emp");
		
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
