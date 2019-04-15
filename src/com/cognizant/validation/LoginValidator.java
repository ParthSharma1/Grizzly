package com.cognizant.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.model.AdminModel;
import com.cognizant.service.AdminService;
@Component("LoginValidator")
public class LoginValidator implements Validator {

	@Autowired
	private AdminService adminLoginService;
	
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(AdminModel.class);
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		AdminModel admin=(AdminModel)arg0;
		int loginResult=adminLoginService.validateAdmin(admin);
		if(loginResult==1)
		{
			arg1.rejectValue("adminId","com.cognizant.controller.wrongAdminId");
		}
		else if(loginResult==2){
			arg1.rejectValue("adminPassword","com.cognizant.controller.wrongAdminPassword");
			}
		
	}

}
