package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.MedicineDAO;
import com.cognizant.entity.Medicine;
import com.cognizant.model.MedicineModel;
import com.cognizant.model.MedicineRequestModel;
@Service
public class MedicineServiceImpl implements MedicineService{
	
	@Autowired
	private MedicineDAO medicineDAO;
	@Autowired
	private MedicineModel medicineModel;
	public List<MedicineModel> getAllMedicines() {
		// TODO Auto-generated method stub
		List<Medicine> medicineList=medicineDAO.getAllMedicines();
		List<MedicineModel> medicineModelList=medicineModel.medicineEntityToModelList(medicineList);
		return medicineModelList;
	}

	
	public int addMedicine(MedicineModel medicine) {
		
		if(medicine.getPrescribedFor().equals("A")||medicine.getPrescribedFor().equals("C"))
			{
			Medicine medicineObj=medicineModel.medicineModelToEntity(medicine);
			return medicineDAO.addMedicine(medicineObj);}
		else 
			return 1;
	
	}

	
	public boolean updateMedicine(MedicineModel medicine) {
		// TODO Auto-generated method stub
		Medicine medicineObj=medicineModel.medicineModelToEntity(medicine);
		
		return medicineDAO.updateMedicine(medicineObj);
		
	}

	
	public MedicineModel retrieveMedicine(String medicineId) {
		int medId=Integer.parseInt(medicineId);
		
		Medicine medicine=medicineDAO.retrieveMedicine(medId);
		
		MedicineModel medicinemodel=medicineModel.medicineEntityToModel(medicine);
		
		
		return medicinemodel;
		
	}

	
	public List<MedicineModel> getStockList() {
		// TODO Auto-generated method stub
		
		List<Medicine> medicineList=medicineDAO.getStockList();
		List<MedicineModel> medicineModelList=medicineModel.medicineEntityToModelList(medicineList);
		
		return medicineModelList;
	}


	public boolean updateMedicineQuantity(MedicineModel medicine) {
		// TODO Auto-generated method stub
		Medicine medicineObj=medicineModel.medicineModelToEntity(medicine);
		return medicineDAO.updateMedicineQuantity(medicineObj);
	}

	
}
