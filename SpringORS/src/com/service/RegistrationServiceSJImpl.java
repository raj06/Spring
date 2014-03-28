package com.service;

import java.util.List;

import com.dao.RegistrationDaoInt;
import com.dto.RegistrationDTO;

public class RegistrationServiceSJImpl implements RegistrationServiceInt {
     RegistrationDaoInt registrationDaoInt;
	public void setRegistrationDaoInt(RegistrationDaoInt registrationDaoInt) {
		this.registrationDaoInt = registrationDaoInt;
	}
	public void addRegistration(RegistrationDTO registrationDTO) {
		// TODO Auto-generated method stub
		registrationDaoInt.addRegistration(registrationDTO);
		
	}
	public boolean auth(RegistrationDTO registrationDTO) {
		// TODO Auto-generated method stub
		return registrationDaoInt.auth(registrationDTO);
	}
	public List userRegistrationList() {
		return registrationDaoInt.userRegistrationList();
		
	}

}
