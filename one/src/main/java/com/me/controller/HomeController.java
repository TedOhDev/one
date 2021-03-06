package com.me.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	 public String about(Locale locale, Model model) {
		
		return "about";
	 }
	
	
	@RequestMapping(value = "/daily", method = RequestMethod.GET)
	 public String daily(Locale locale, Model model) {
		
		return "daily";
	 }
	
	@RequestMapping(value = "/skills", method = RequestMethod.GET)
	 public String skills(Locale locale, Model model) {
		
		return "skills";
	 }
	
	@RequestMapping(value = "/c_list", method = RequestMethod.GET)
	 public String c_list(Locale locale, Model model) {
		
		return "cboard/c_list";
	 }
	
} // homeController end
