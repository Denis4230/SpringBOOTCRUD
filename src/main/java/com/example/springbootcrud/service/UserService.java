package com.example.springbootcrud.service;

import com.example.springbootcrud.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void addAndUpdate(User user);
    public void delete(int id);

}
