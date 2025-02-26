package com.example.High_Performance.Inventory.Management.System.controller;

import com.example.High_Performance.Inventory.Management.System.model.dto.UserRequest;
import com.example.High_Performance.Inventory.Management.System.model.dto.UserResponse;
import com.example.High_Performance.Inventory.Management.System.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequest user) {
        return ResponseEntity.ok(userService.createUser(user));
    }
}
