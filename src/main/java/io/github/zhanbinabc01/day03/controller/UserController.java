package io.github.zhanbinabc01.day03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("show_index")
	public String showIndex(Model model) {
		System.out.println("day03原始版本测试提交更新");
		model.addAttribute("msg", "userController传来信息");
		model.addAttribute("msg3", "userController传来信息3");
		model.addAttribute("msg2", "userController传来信息2");
		return "index";
	}
}
