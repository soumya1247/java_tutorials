package com.springboot.learnspringsecurity.resources;

import java.util.List;
import java.util.function.Predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.security.RolesAllowed;

@RestController
public class TodoResource {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	private static final List<Todo> TODOS_LIST = List.of(new Todo("Learn AWS", "Description 1"), new Todo("Learn Azure", "Description 2"));

	@GetMapping("/todos")
	public List<Todo> retrieveAllTodos() {
		return TODOS_LIST;
	}
	

	@GetMapping("/users/{username}/todos")
//	@PreAuthorize("hasRole('USER') and #username == authentication.name")
//	@PostAuthorize("returnObject.username == 'someuser'")
	@RolesAllowed({"ADMIN", "USER"})
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	public Todo retrieveTodosForSpecificUser(@PathVariable("username") String username) {
		
//		Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
//		return TODOS_LIST.stream().filter(predicate).findFirst().get();
		return TODOS_LIST.get(0);
	}
	
	@PostMapping("/users/{username}/todos")
	public void createTodoForSpecificUser(@PathVariable("username") String username, @RequestBody Todo todo) {
		
		logger.info("Create {} from {}", todo, username);
	}
}
