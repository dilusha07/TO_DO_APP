package com.example.ToDoApp.Validators;

import com.example.ToDoApp.dto.UserDto;
import io.micrometer.common.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {

    public static List<String> validateUser(UserDto user) {
        List<String> errors = new ArrayList<>();
        if (user == null) {
            errors.add("Please fill the user Email");
            errors.add("Please fill the User Password");
            return errors;
        }
        if (StringUtils.isEmpty(user.getEmail())) {
            errors.add("Please fill the user Email");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            errors.add("Please fill the User Password");
        }

        return errors;
    }

    public static List<String> validateUserCredentials(String email, String password) {
        List<String> errors = new ArrayList<>();
        if (StringUtils.isEmpty(email)) {
            errors.add("Email is empty");
        }
        if (StringUtils.isEmpty(password)) {
            errors.add("Password is empty");
        }
        return errors;
    }
}


