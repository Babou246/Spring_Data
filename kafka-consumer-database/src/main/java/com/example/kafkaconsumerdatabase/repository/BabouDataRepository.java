package com.example.kafkaconsumerdatabase.repository;

import com.example.kafkaconsumerdatabase.entity.BabouData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BabouDataRepository extends JpaRepository<BabouData,Long> {
}
