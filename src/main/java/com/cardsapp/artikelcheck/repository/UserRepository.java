package com.cardsapp.artikelcheck.repository;

import com.cardsapp.artikelcheck.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String username);
}
