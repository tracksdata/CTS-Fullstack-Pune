package com.cts.product.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Login;
import com.cts.product.service.UserService;

@Controller
@Scope("session")
@SessionAttributes(value= {"s1","s2"})
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/validateUser")
	public ModelAndView validateUser(@ModelAttribute("login") Login login, HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();

		if (userService.validateUser(login)) {
			HttpSession session = request.getSession(true);
			mav.addObject("login", login);
			session.setAttribute("login", login);
			mav.setViewName("welcome");

		} else {
			mav.addObject("message", "Invalid user Name / Password");
			mav.setViewName("login");
		}

		return mav;
	}

	@RequestMapping("logout.htm")
	public String test(Model model) {

		System.out.println("---- logout  ");
		model.addAttribute("message", "User logedout successfully");

		return "login";
	}

}
