package com.cognizant.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.entity.BranchAdmin;
import com.cognizant.exception.BranchAdminException;
import com.cognizant.model.BranchAdminModel;
import com.cognizant.service.BranchAdminService;

@Component("BranchAdminValidator")
public class BranchAdminValidator implements Validator {
	@Autowired
	private BranchAdminService branchAdminService;
	
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(BranchAdminModel.class);
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		BranchAdminModel branchAdmin=(BranchAdminModel)arg0;
		int registerResult=branchAdminService.checkBranchAdminDetails(branchAdmin);
		if(registerResult==1)
		{
			try{
				throw new BranchAdminException("contactNo already Exists");
				}catch(BranchAdminException ae){
					System.out.println(ae);
				} 
			arg1.rejectValue("branchAdminContactNo","com.cognizant.controller.wrongAdminContactNo");
		}
		else if(registerResult==2){
			try{
				throw new BranchAdminException("EmailID already Exists");
				}catch(BranchAdminException ae){
					System.out.println(ae);
				} 
			arg1.rejectValue("branchAdminEmailId","com.cognizant.controller.wrongAdminEmailId");
			}
		else if(registerResult==3){
			try{
				throw new BranchAdminException("invalid contactNo and emailId");
				}catch(BranchAdminException ae){
					System.out.println(ae);
				} 
			arg1.rejectValue("branchAdminContactNo","com.cognizant.controller.wrongBranchAdminContactNo");
			arg1.rejectValue("branchAdminEmailId","com.cognizant.controller.wrongBranchAdminEmailId");
			}
		else if(registerResult==4){
			boolean res=branchAdminService.insertBranchAdminDetails(branchAdmin);
		}
	}


}
