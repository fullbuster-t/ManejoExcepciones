package com.fullbuster.errors.exceptions.services;

import com.fullbuster.errors.exceptions.models.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);


}
