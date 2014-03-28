package com.action;

import com.service.RegistrationServiceInt;

public class LogoutAction extends BaseAction{
private RegistrationServiceInt registrationServiceInt;

	public void setRegistrationServiceInt(
		RegistrationServiceInt registrationServiceInt) {
	this.registrationServiceInt = registrationServiceInt;
}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		session.invalidate();
		return "logout";
		
	}

	@Override
	public String input() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
