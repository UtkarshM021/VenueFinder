package com.venuefinder.service;

import com.venuefinder.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void saveUser(User u);
    public List<User> getUsers();
    public Optional<User> getUserById(Long userId);
}
