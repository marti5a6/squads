package com.squads.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.squads.dto.roleDTO;

@Repository
public interface roleDAO extends JpaRepository<roleDTO, Integer> {
    roleDTO findByRole(String role);
}
