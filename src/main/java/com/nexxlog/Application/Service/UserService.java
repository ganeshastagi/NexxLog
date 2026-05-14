package com.nexxlog.Application.Service;

import com.nexxlog.Application.Model.User;
import com.nexxlog.Application.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User addUser(User user) {
        return repo.save(user);
    }

    public List<User> getUser (User user) {
         return repo.findAll();
    }
}
