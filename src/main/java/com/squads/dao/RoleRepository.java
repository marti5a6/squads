package com.squads.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.squads.entity.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
    Optional<Role> findUserByUsername(String username); 
}
