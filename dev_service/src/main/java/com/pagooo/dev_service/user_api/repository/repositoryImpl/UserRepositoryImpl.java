package com.pagooo.dev_service.user_api.repository.repositoryImpl;

import com.pagooo.dev_service.entity.user.User;
import com.pagooo.dev_service.user_api.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryImpl  extends UserRepository, JpaRepository<User, Long> {
    @Override
    boolean existsByEmail(String email);

    @Override
    User save(User user);
}
