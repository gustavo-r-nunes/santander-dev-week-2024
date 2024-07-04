package me.dio.santander_dev_week_2024.service;

import me.dio.santander_dev_week_2024.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
