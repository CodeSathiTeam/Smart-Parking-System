package com.codeSathi.dto;

import java.time.LocalDateTime;

import com.codeSathi.entities.BookingStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingDTO {
	
	private Long id;
	private Long userId;
	private Long slotId;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private BookingStatus status;
}
