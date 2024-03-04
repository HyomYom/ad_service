package com.pagooo.dev_service.entity.user;


import com.pagooo.dev_service.util.BooleanToYNConverter;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;
    private String lastName;
    private String firstName;
    private LocalDate birth;
    private String phone;
    private LocalDateTime verifyExpiredAt;

    @Column(length = 1)
    @Convert(converter = BooleanToYNConverter.class)
    private String verify;

}
