package com.squads.service;

import java.util.List;

import com.squads.entity.Role;

public interface RoleService {
    public List<Role> findAll();

    public void save(Role theRole);
}
