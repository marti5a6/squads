package com.squads.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.squads.dto.RoleDTO;

@Repository
public interface RoleDAO extends JpaRepository<RoleDTO, Integer> {
    RoleDTO findByRole(String role);
}
