package com.cognizant.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.exception.AdminException;
import com.cognizant.model.AdminModel;
import com.cognizant.service.AdminService;
@Component("RegisterValidator")
public class RegisterValidator implements Validator {
	@Autowired
	private AdminService adminService;
	
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(AdminModel.class);
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		AdminModel admin=(AdminModel)arg0;
		int registerResult=adminService.checkAdminCredentials(admin);
		if(registerResult==1)
		{
			try{
				throw new AdminException("ContactNo already Exists");
				}catch(AdminException ae){
					System.out.println(ae);
				} 
			arg1.rejectValue("adminContactNo","com.cognizant.controller.wrongAdminContactNo");
		}
		else if(registerResult==2){
			try{
				throw new AdminException("EmailID already Exists");
				}catch(AdminException ae){
					System.out.println(ae);
				} 
			arg1.rejectValue("adminEmailId","com.cognizant.controller.wrongAdminEmailId");
			}
		else if(registerResult==3){
			try{
				
			arg1.rejectValue("adminContactNo","com.cognizant.controller.wrongAdminContactNo");
			arg1.rejectValue("adminEmailId","com.cognizant.controller.wrongAdminEmailId");
			throw new AdminException("Wrong contact Number or Email Id");
			}catch(AdminException ae){
				System.out.println(ae);
			}
			}
		else if(registerResult==4){
			adminService.registerAdmin(admin);
			
		}
		
	}

}
