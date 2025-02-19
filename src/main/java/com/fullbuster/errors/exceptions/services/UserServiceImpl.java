package com.fullbuster.errors.exceptions.services;

import com.fullbuster.errors.exceptions.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {

        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        Optional<User> user = users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();

//        for (User u : users) {
//            if (u.getId().equals(id)){
//                user = u;
//                break;
//            }
//        }
//        return Optional.ofNullable(user);

        return user;
    }
}
