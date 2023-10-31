package com.example.esercizio3;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	private final ArrayList<Task> tasks = new ArrayList<>();
	
	@PostMapping("/addTask")
	public void aggiungereTask(@RequestBody Task t) {
		tasks.add(t);
	}
	
	@GetMapping("/tasks")
	public ArrayList<Task> ottenereTask() {
		return tasks;
	}
	
	@GetMapping("/tasks/{id}")
	public Task ottenereTask(@PathVariable int id) {
		for(Task t: tasks) {
			if(t.getId() == id)
				return t;
		}
		return null;
	}
	
	@DeleteMapping("/rimuovitask/{id}")
	public void rimuovereTask(@PathVariable int id) {
		for(Task t: tasks) {
			if(t.getId() == id)
				tasks.remove(t);
		}
	}
}
