package com.codeSathi.dto;

import com.codeSathi.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthResponseDTO {

	private String email;

	private String message;

	private Role role;

	private String token;
}
