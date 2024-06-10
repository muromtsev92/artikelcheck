package com.cardsapp.artikelcheck.model.users;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {
    private String name;
    private String password;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(0L, name, passwordEncoder.encode(password));
    }
}
