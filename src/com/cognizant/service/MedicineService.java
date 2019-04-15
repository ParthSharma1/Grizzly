package com.cognizant.service;

import java.util.List;

import com.cognizant.entity.Medicine;
import com.cognizant.model.MedicineModel;

public interface MedicineService {
	List<MedicineModel> getAllMedicines();
	int addMedicine(MedicineModel medicine);
	boolean updateMedicine(MedicineModel medicine);
	MedicineModel retrieveMedicine(String medicineId);
	List<MedicineModel> getStockList();
	boolean updateMedicineQuantity(MedicineModel medicine);
	
	
}
