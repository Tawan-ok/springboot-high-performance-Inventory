package com.example.High_Performance.Inventory.Management.System.repository;

import com.example.High_Performance.Inventory.Management.System.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
