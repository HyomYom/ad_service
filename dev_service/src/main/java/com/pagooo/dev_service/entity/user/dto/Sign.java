package com.pagooo.dev_service.entity.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

public class Sign {




    @Data
    @NoArgsConstructor
    public static class Up  {
        private String email;
        private String password;
        private String lastName;
        private String firstName;
        private LocalDate birth;
        private List<String> roles;
        private String phone;

    }

    public static class In  {

    }
}
