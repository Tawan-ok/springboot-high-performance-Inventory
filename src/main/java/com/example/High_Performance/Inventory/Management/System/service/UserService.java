package com.example.High_Performance.Inventory.Management.System.service;

import com.example.High_Performance.Inventory.Management.System.model.User;
import com.example.High_Performance.Inventory.Management.System.model.dto.UserRequest;
import com.example.High_Performance.Inventory.Management.System.model.dto.UserResponse;
import com.example.High_Performance.Inventory.Management.System.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(UserRequest user) {
        User newUser = new User();
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
        userRepository.save(newUser);

        return new UserResponse(newUser.getName(), newUser.getEmail());
    }
}
