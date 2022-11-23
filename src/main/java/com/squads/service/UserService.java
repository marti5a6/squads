package com.squads.service;

import java.util.List;

import com.squads.entity.User;

public interface UserService {
    public List<User> findAll();

    public void save(User theUser);
}
