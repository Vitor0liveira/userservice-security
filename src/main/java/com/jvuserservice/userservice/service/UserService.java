package com.jvuserservice.userservice.service;

import com.jvuserservice.userservice.domain.Role;
import com.jvuserservice.userservice.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String userName, String roleName);
    User getUser(String userName);
    List<User> getUsers();
}
