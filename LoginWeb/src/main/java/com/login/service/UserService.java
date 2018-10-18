package com.login.service;

import com.login.model.User;

public interface UserService {
  
 public User findUserByEmail(String email);
 
 public void saveUser(User user);
}