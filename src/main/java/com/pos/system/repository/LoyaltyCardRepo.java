package com.pos.system.repository;

import com.pos.system.entity.LoyaltyCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoyaltyCardRepo extends JpaRepository<LoyaltyCard, String> {
}
