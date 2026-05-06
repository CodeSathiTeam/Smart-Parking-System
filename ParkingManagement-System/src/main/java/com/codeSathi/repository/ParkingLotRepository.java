package com.codeSathi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeSathi.entities.ParkingLot;

public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long>{

	Optional<ParkingLot> findByOwnerId(Long ownerId);
}