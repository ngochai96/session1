package com.java.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("QLMatHang")
public class QLMatHangController {
	@RequestMapping(value="list")
	public String timkiem() {
		return "jsp/qlMatHang/list.jsp";
	}
}
