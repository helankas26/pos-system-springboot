package com.pos.system.repository;

import com.pos.system.entity.Refund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefundRepo extends JpaRepository<Refund, String> {
}
