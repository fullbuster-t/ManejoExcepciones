package com.fullbuster.errors.exceptions;

import com.fullbuster.errors.exceptions.models.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    List<User> Users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Silverio", "Martinez"));
        users.add(new User(2L, "Jimena", "Rodriguez"));
        users.add(new User(3L, "Natalia", "Santiago"));
        users.add(new User(4L, "Maria", "Castillo"));
        users.add(new User(5L, "Alonso", "Torres"));

        return users;
    }

}
