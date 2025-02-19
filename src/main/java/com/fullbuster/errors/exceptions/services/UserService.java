package com.fullbuster.errors.exceptions.services;

import com.fullbuster.errors.exceptions.models.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(Long id);


}
