package com.pos.system.repository;

import com.pos.system.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplicationUserRepo extends JpaRepository<ApplicationUser, String> {
    public Optional<ApplicationUser> findByUsername(String username);
}
