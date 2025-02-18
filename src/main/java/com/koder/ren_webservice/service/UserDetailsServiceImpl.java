package com.koder.ren_webservice.service;

import com.koder.ren_webservice.model.User;
import com.koder.ren_webservice.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired(required = true)
    private UserDetailsRepository repository;

    @Override
    public List<User> getUsers() {
        return List.of();
    }

    @Override
    public Optional<User> findUserById(String email) {
        return repository.findById(email);
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
