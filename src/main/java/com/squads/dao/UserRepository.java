package com.squads.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.squads.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserByUsername(String username); 
}
