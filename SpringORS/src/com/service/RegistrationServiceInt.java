package com.service;

import java.util.List;

import com.dto.RegistrationDTO;

public interface RegistrationServiceInt {
	public void addRegistration(RegistrationDTO registrationDTO);
	public boolean auth(RegistrationDTO registrationDTO);
	public List userRegistrationList();
}
