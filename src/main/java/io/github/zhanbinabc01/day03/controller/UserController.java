package io.github.zhanbinabc01.day03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("show_index")
	public String showIndex() {
		return "index";
	}
}
