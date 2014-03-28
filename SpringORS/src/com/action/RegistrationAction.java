package com.action;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistrationDaoInt;
import com.dto.RegistrationDTO;
import com.service.RegistrationServiceInt;

public class RegistrationAction extends BaseListAction {
	private String name;
	private String sername;
	private String userid;
	private String password;
	private String gender;
	private Date dob;
	private String country;
	private String state;
	private String city;
	private String emailid;
	private String hobby;
	private String mobileno;
	private RegistrationServiceInt registrationServiceInt;
	

	public void setRegistrationServiceInt(
			RegistrationServiceInt registrationServiceInt) {
		this.registrationServiceInt = registrationServiceInt;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if("register".equalsIgnoreCase(operation))
		{
		RegistrationDTO registrationDTO = new RegistrationDTO();
		registrationDTO.setCity(city);
		registrationDTO.setCountry(country);
		registrationDTO.setDob(dob);
		registrationDTO.setEmailid(emailid);
		registrationDTO.setGender(gender);
		registrationDTO.setHobby(hobby);
		registrationDTO.setName(name);
		registrationDTO.setPassword(password);
		registrationDTO.setSername(sername);
		registrationDTO.setState(state);
		registrationDTO.setUserid(userid);
		registrationDTO.setMobileno(mobileno);
		list=registrationServiceInt.userRegistrationList();
		System.out.println(list.size());
		System.out.println(userid);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			RegistrationDTO registrationDTO2 = (RegistrationDTO) iterator
					.next();
			System.out.println(registrationDTO2.getUserid());
			if (userid.equalsIgnoreCase(registrationDTO2.getUserid())) {
				addActionError("Userid are already exits");
				return "already";
			}
		}
		registrationServiceInt.addRegistration(registrationDTO);
		return "register";
		}
		return SUCCESS;
	}

	@Override
	public String input() throws Exception {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		list = registrationServiceInt.userRegistrationList();
		super.prepare();
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSername() {
		return sername;
	}

	public void setSername(String sername) {
		this.sername = sername;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	

}
