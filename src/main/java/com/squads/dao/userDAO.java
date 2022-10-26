package com.squads.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.squads.dto.userDTO;

@Repository
public interface userDAO extends JpaRepository<userDTO, Long> {
    userDTO findByEmail(String email);
    userDTO findByUserName(String userName);
}
