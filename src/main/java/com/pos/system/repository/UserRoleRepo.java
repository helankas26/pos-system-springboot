package com.pos.system.repository;

import com.pos.system.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRoleRepo extends JpaRepository<UserRole, String> {
    Optional<UserRole> findByRole(String role);
}
