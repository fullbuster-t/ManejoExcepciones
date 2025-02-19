package com.fullbuster.errors.exceptions.services;

import com.fullbuster.errors.exceptions.models.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Silverio", "Martinez"));
        users.add(new User(2L, "Jimena", "Rodriguez"));
        users.add(new User(3L, "Natalia", "Santiago"));
        users.add(new User(4L, "Maria", "Castillo"));
        users.add(new User(5L, "Alonso", "Torres"));
    }

    @Override
    public List<User> findAll() {

        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;
        for (User u : users) {
            if (u.getId().equals(id)){
                user = u;
                break;
            }
        }

        return Optional.ofNullable(user);
    }
}
