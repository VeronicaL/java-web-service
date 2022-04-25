package com.epam.user.controller;

import com.epam.user.model.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    //nnn/users -> {name,secondname, email},{}

    //post - ///user  body{name,secondname, email}

    public static List<User> users = new ArrayList<>();
    static {
        users.add(new User("Olga", "Petrova", "ttt@mail.ru"));
        users.add(new User("Olga2", "Petrova2", "yyyy@mail.ru"));
    }

    @GetMapping("/library_dev/users")
    public  List<User> getAllUsers() {
        return users;
    }

    @PostMapping("/library_dev/user")
    public  void createUser(@Valid @RequestBody User user) {

        users.add(user);
    }
}
