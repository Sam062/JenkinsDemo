package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping({"/","/home"})
	public String showHome(Model model) {
		model.addAttribute("msg", "HI THERE, This is Home page.");
		return "home";
	}

}
