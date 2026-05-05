package com.codeSathi.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Fields: id, lotId, slotNumber, status
//SlotStatus enum: AVAILABLE, BOOKED
//@ManyToOne with ParkingLot

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Slot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "lot_id", nullable = false)
	private ParkingLot parkingLot;
	
	@Column(nullable = false)
	private Integer slotNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private SlotStatus status;
	
	@OneToMany(mappedBy = "slot", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}