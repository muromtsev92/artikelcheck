package com.cardsapp.artikelcheck.model.users;

import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.Data;
import com.cardsapp.artikelcheck.model.users.User;

@Data
public class RegistrationForm {
    private String username;
    private String password;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(username, passwordEncoder.encode(password));
    }
}

