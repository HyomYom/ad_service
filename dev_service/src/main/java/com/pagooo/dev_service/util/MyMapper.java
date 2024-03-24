package com.pagooo.dev_service.util;


import com.pagooo.dev_service.entity.user.User;
import com.pagooo.dev_service.entity.user.dto.Sign;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class MyMapper {
    private final ModelMapper modelMapper;

    public Sign.Up toUserDto(User user){
        return modelMapper.map(user, Sign.Up.class);
    }

    public User toUser(Sign.Up signUp){
        return modelMapper.map(signUp, User.class);
    }
}
