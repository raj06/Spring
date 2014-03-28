package com.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dto.RegistrationDTO;

public class RegistrationDaoJdbcImpl extends JdbcDaoSupport implements
		RegistrationDaoInt {

	public void addRegistration(RegistrationDTO registrationDTO) {
		// TODO Auto-generated method stub
		String sql = "insert into registration value(?,?,?)";
		getJdbcTemplate()
				.update(
						sql,
						new Object[] { registrationDTO.getCity(),
								registrationDTO.getCountry(),
								registrationDTO.getDob(),
								 });

	}

	public boolean auth(RegistrationDTO registrationDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	public List userRegistrationList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void Default() {
		// TODO Auto-generated method stub
		
	}

}
