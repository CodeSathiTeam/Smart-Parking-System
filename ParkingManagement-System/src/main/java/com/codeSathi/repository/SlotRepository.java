package com.codeSathi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeSathi.entities.Slot;
import com.codeSathi.entities.SlotStatus;

public interface SlotRepository extends JpaRepository<Slot, Long>{
	
	List<Slot> findByParkingLotId(Long lotId);
	
	List<Slot> findByParkingLotIdAndStatus(Long lotId, SlotStatus status);
	
	long countByParkingLotIdAndStatus(Long lotId, SlotStatus status);
}
