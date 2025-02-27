package org.example.jekinstest.service;

import org.example.jekinstest.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Alice", 25),
                new User("Bob", 30),
                new User("Charlie", 28)
        );
    }
}
