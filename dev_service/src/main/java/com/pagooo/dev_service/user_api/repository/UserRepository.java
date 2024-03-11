package com.pagooo.dev_service.user_api.repository;

import com.pagooo.dev_service.entity.user.User;

public interface UserRepository {

    boolean existsByEmail(String email);

    User save(User user);
}
