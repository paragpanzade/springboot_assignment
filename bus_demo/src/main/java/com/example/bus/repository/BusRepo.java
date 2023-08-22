package com.example.bus.repository;

import com.example.bus.entity.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepo extends JpaRepository<Bus, Long> {
    @Autowired
    BusRepo bRepo = null;
}
