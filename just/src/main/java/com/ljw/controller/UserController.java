package com.ljw.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ljw.dto.User;
import com.ljw.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/show")
	public String showUser(HttpServletRequest request, Model model){
		Integer userid = Integer.parseInt(request.getParameter("id"));
		User user = userService.queryById(userid);
		System.out.println("-----"+user);
		model.addAttribute("user",user);
		return "show";
	}
}
