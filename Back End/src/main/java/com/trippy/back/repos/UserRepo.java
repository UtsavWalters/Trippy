package com.trippy.back.repos;

import com.trippy.back.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository <Account, Long> {
    Account findByEmail(String email);
    Account findByToken(String token);
}
