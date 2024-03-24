package com.pagooo.dev_service.user_api.service;

import com.pagooo.dev_service.entity.user.dto.Sign;

public interface SignService {
    Sign.Up signUp(Sign.Up form);

    Sign.In signIn(Sign.In form);
}
