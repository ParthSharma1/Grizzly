package com.cognizant.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.entity.MedicineRequest;
import com.cognizant.model.MedicineRequestModel;
import com.cognizant.service.MedicineRequestService;

@Component("RequestValidator")
public class RequestValidator implements Validator {
	@Autowired
	private MedicineRequestService medicineService;
	
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(MedicineRequestModel.class);
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		MedicineRequestModel medicineRequest=(MedicineRequestModel)arg0;
		boolean requestResult=medicineService.checkMedicineRequest(medicineRequest);
		if(requestResult==false)
		{
			
			arg1.rejectValue("branchA","com.cognizant.controller.wrongAdminContactNo");
		}

	}


}
