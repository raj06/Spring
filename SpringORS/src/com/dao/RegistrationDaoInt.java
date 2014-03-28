package com.dao;

import java.util.List;

import com.dto.RegistrationDTO;

public interface RegistrationDaoInt {
	public void addRegistration(RegistrationDTO registrationDTO);

	public boolean auth(RegistrationDTO registrationDTO);

	public List userRegistrationList();
	public void Default();
}
