package com.codeSathi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParkingLotDTO {
	
	private Long id;
	private Long ownerId;
	private String location;
	private Integer totalSlots;
	private Long availableSlots;
}
