package com.pos.system.repository;

import com.pos.system.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepo extends JpaRepository<Batch, String> {
}
