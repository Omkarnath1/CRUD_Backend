package com.example.CRUD_Backend.Repoitory;


import com.example.CRUD_Backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
