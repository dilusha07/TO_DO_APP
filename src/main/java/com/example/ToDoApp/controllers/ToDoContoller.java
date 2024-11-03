package com.example.ToDoApp.controllers;

import com.example.ToDoApp.model.Todo;
import com.example.ToDoApp.services.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ToDoContoller {

    private final TodoService todoService;

    public ToDoContoller(TodoService todoService) {
        this.todoService = todoService;
    }


    @GetMapping("/todos/{id}")
    public Todo getTodoDetailsByTaskId(@PathVariable("taskId") final int taskId) {
        return todoService.getTodo(taskId);
    }

    @PostMapping("/todos")
    public void createTodo(@RequestBody Todo todo) {
       todoService.addTodo(todo);
    }

    @PutMapping("/todos/{taskId}")
    public Todo updateTodo(@PathVariable("taskId") final int taskId, @RequestBody Todo todo) {
        todoService.updateTodo(taskId, todo);
        return todo;
    }

    @DeleteMapping("/todos/{taskId}")
    public ResponseEntity<Void> deleteTodo(@PathVariable("taskId") final int taskId) {
        todoService.deleteTodo(taskId);
        return ResponseEntity.noContent().build();
    }


}
