package com.juinjett.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
//	@ResponseBody
	public String showLogin(ModelMap model) {
		model.put("name", "junjie");
		return "welcome";
	}
	
	

}
