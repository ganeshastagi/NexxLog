package com.nexxlog.Application.Controller;

import com.nexxlog.Application.Model.User;
import com.nexxlog.Application.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService service;

    @PostMapping("/register")
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @GetMapping("/getUser")
    public List<User> getUser(User user) {
        return service.getUser(user);
    }
}
