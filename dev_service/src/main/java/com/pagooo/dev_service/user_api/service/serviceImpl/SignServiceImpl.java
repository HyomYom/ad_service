package com.pagooo.dev_service.user_api.service.serviceImpl;

import com.pagooo.dev_service.entity.user.User;
import com.pagooo.dev_service.entity.user.dto.Sign;
import com.pagooo.dev_service.user_api.repository.UserRepository;
import com.pagooo.dev_service.user_api.service.SignService;
import com.pagooo.dev_service.util.MyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SignServiceImpl implements SignService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final MyMapper myMapper;

    @Override
    public Sign.Up signUp(Sign.Up form) {
        boolean exist = userRepository.existsByEmail(form.getEmail());
        if(!exist){
            form.setPassword(passwordEncoder.encode(form.getPassword()));
            User user = myMapper.toUser(form);

            return myMapper.toUserDto(userRepository.save(user));

        } else {
            throw new RuntimeException("HI");
        }

    }

    @Override
    public Sign.In signIn(Sign.In form) {
        return null;
    }
}
