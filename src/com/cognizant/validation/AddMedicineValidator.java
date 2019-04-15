package com.cognizant.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.exception.MedicineException;
import com.cognizant.model.MedicineModel;
import com.cognizant.service.MedicineService;
import com.sun.media.jfxmedia.logging.Logger;
@Component("AddMedicineValidator")
public class AddMedicineValidator implements Validator {
	@Autowired
	private MedicineService medicineService;
	
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(MedicineModel.class);
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		MedicineModel medicine=(MedicineModel)arg0;
		int result=medicineService.addMedicine(medicine);
		
		if(result==1)
		{
			try{
			arg1.rejectValue("prescribedFor","com.cognizant.controller.prescribedFor");
			throw new MedicineException("Character Other then A or C is added ");
			}catch(Exception me)
			{
				System.out.println(me);
				
			}
			}
		if(result==2){
			try{
				arg1.rejectValue("medicineId","Medicine Id is Null");
				throw new MedicineException("Medicine Id can't be Null ");
			}catch(Exception me){
				System.out.println(me);
			}
		}
		
	}

}
