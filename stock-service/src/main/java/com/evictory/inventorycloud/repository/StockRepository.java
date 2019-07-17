package com.evictory.inventorycloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evictory.inventorycloud.modal.Stock;

import java.awt.*;
import java.time.ZonedDateTime;

public interface StockRepository extends JpaRepository<Stock, Integer>{


}
