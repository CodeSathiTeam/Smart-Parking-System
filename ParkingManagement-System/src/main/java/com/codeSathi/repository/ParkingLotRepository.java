package com.codeSathi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeSathi.entities.ParkingLot;

public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long>{

	List<ParkingLot> findByOwnerId(Long ownerId);
}