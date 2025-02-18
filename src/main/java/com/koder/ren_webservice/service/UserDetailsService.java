package com.koder.ren_webservice.service;

import com.koder.ren_webservice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserDetailsService {

    public List<User> getUsers();

    public Optional<User> findUserById(String id);

    public User createUser(User user);

    public User updateUser(User user);
}
