package com.action;

import com.dto.RegistrationDTO;
import com.service.RegistrationServiceInt;

public class LoginAction extends BaseAction {
	private String userid;
	private String password;
    private RegistrationServiceInt registrationServiceInt;
	public void setRegistrationServiceInt(
			RegistrationServiceInt registrationServiceInt) {
		this.registrationServiceInt = registrationServiceInt;
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
    RegistrationDTO registrationDTO=new RegistrationDTO();
	@Override
	public String execute() throws Exception {
		System.out.println("Execute");
		if("login".equalsIgnoreCase(operation))
		{
			System.out.println("Login");
			registrationDTO.setUserid(userid);
			registrationDTO.setPassword(password);
			boolean b=registrationServiceInt.auth(registrationDTO);
			if(b==true)
			{
				session.setAttribute("userid",userid);
				return "login";
			}
			else
			{
				addActionError("User Id or Password wrong");
			}
		}
		return SUCCESS;
	}

	@Override
	public String input() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("input");
		return INPUT;
	}

}
