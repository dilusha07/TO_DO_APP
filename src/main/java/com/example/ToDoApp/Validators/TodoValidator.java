package com.example.ToDoApp.Validators;

import com.example.ToDoApp.dto.TodoDto;

import java.util.ArrayList;
import java.util.List;

public class TodoValidator {

    public static List<String> validateTodo(TodoDto todoDto) {
        List<String> errors = new ArrayList<>();
        if (todoDto == null) {
            errors.add("Please fill the task name");
            errors.add("Please fill the description");
            return errors;
        }
        if (todoDto.getTaskName() == null || todoDto.getTaskName().isBlank()) {
            errors.add("Please fill the task name");
        }
        if (todoDto.getDescription() == null || todoDto.getDescription().isBlank()) {
            errors.add("Please fill the description");
        }

        return errors;
    }
}
