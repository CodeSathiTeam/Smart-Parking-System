package com.codeSathi.dto;

import com.codeSathi.entities.SlotStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SlotDTO {
	
	private Long id;
	private Long lot_id;
	private Integer slotNumber;
	private SlotStatus status;
}
