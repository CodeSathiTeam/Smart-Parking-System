package com.codeSathi.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeSathi.entities.Booking;
import com.codeSathi.entities.BookingStatus;

//BookingRepository.java (40 min)
//findByUserId(Long userId)
//existsBySlotIdAndStatusAndStartTimeBeforeAndEndTimeAfter()
//findByStatusAndEndTimeBefore()

public interface BookingRepository extends JpaRepository<Booking, Long>{
	
	List<Booking> findByUserId(Long userId);
	
	List<Booking> findByUserIdAndStatus(Long userId, BookingStatus status);
	
	List<Booking> findByStatusAndEndTimeBefore(BookingStatus status, LocalDateTime time);
	
	boolean existsBySlotIdAndStatusAndStartTimeBeforeAndEndTimeAfter(
			Long slotId,
			BookingStatus status,
			LocalDateTime endTime,
			LocalDateTime startTime
			);	

}
