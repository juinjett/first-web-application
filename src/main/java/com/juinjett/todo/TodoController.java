package com.juinjett.todo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
//	@ResponseBody
	public String showList(ModelMap model) {
		model.addAttribute("todo", service.retrieveTodos("junjie"));
		return "list-todos";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
//	@ResponseBody
	public String showNewTodo(ModelMap model) {
		return "add-todo";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
//	@ResponseBody
	public String addNewTodo(ModelMap model) {
		model.clear();
		return "redirect:list-todos";
	}
}
