package com.evictory.inventorycloud.repository;

import com.evictory.inventorycloud.modal.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BatchRepository extends JpaRepository<Batch, Integer> {


}
