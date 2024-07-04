package me.dio.santander_dev_week_2024.repository;

import me.dio.santander_dev_week_2024.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Boolean existsByAccountNumber(String accountNumber);
}
