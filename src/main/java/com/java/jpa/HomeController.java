package com.java.jpa;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.jpa.service.NhanVienService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//	@Inject
//	private NhanVienService service;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
//		model.addAttribute("nhanvien", service.findById(1));
		return "home";
	}
	
//	@RequestMapping(value="/jpa/home")
//	public String home() {
//		return "jsp/NewFile";
//	}
	
	@RequestMapping(value="/admin")
	public String admin() {
		return "jsp/NewFile";
	}
	@RequestMapping("/login")
	public String login() {
		return "login/login";
	}
	
}
