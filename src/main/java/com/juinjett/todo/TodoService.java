package com.juinjett.todo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 3;
	
	static {
		todos.add(new Todo(1, "junjie", "Learn Spring MVC", new Date(), false));
		todos.add(new Todo(2, "junjie", "Learn Springboot", new Date(), false));
		todos.add(new Todo(3, "junjie", "Learn Hibernate", new Date(), false));
	}
	
	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<>();
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo curr = iterator.next();
			if (curr.getUser().equals(user))
				filteredTodos.add(curr);
		}
		return filteredTodos;
	}
	
	public void addTodo (String user, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, user, desc, targetDate, isDone));
	}
	
	public void deleteTodo (int id) {
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo curr = iterator.next();
			if (curr.getId() == id)
				iterator.remove();
		}
	}
	
	public Todo retrieveTodo(int id) {
		for (Todo todo : todos) {
			if (todo.getId() == id)
				return todo;
		}
		return null;
	}

	public void updateTodo(Todo todo) {
		todos.remove(todo);
		todos.add(todo);
	}
}
