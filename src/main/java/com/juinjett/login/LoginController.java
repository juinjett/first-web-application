package com.juinjett.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@Autowired
	UserValidationService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	@ResponseBody
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	@ResponseBody
	public String handleLogin(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (!service.isUserVaild(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		model.put("name", name);
		model.put("password", password);
//		System.out.println(name);
		return "welcome";
	}

}
