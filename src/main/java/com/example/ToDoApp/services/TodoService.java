package com.example.ToDoApp.services;

import com.example.ToDoApp.model.Todo;
import com.example.ToDoApp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    @Autowired
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // create new Todo items
    public Todo addTodo(Todo todo){
        todoRepository.save(todo);
        return todo;
    }

    //retrieve their own Todo items
    public List<Todo> getAllTodos() {
        List<Todo> allTodos = new ArrayList<>();
        todoRepository.findAll().forEach(allTodos::add);
        return allTodos;
    }

    //retrieve their own Todo items by Id
    public Todo getTodo(int id){
        Optional<Todo> res = todoRepository.findById(id);
        return res.orElse(null);
    }

    // modify existing Todo items
    public void updateTodo(int id, Todo todo){
        todo.setTaskId(id);
        todoRepository.save(todo);
    }

    //remove Todo items
    public void deleteTodo(int id){
        todoRepository.delete(getTodo(id));
    }

}

