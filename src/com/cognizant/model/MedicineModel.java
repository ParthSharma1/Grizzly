package com.cognizant.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.entity.BranchAdmin;
import com.cognizant.entity.Medicine;
@Component
public class MedicineModel {

	
	Medicine medicine;
	MedicineModel medicineModel;
	
	
	private int medicineId;
	
	private String medicineDescription;
	
	private String cureFor;
	
	private String manufacturingCompany;
	
	private int dosage;
	
	private String prescribedFor;
	
	private int quantity;

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineDescription() {
		return medicineDescription;
	}

	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}

	public String getCureFor() {
		return cureFor;
	}

	public void setCureFor(String cureFor) {
		this.cureFor = cureFor;
	}

	public String getManufacturingCompany() {
		return manufacturingCompany;
	}

	public void setManufacturingCompany(String manufacturingCompany) {
		this.manufacturingCompany = manufacturingCompany;
	}

	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	public String getPrescribedFor() {
		return prescribedFor;
	}

	public void setPrescribedFor(String prescribedFor) {
		this.prescribedFor = prescribedFor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public MedicineModel medicineEntityToModel( Medicine medicine){
		medicineModel=new MedicineModel();
		
		medicineModel.medicineId=medicine.getMedicineId();
		medicineModel.medicineDescription=medicine.getMedicineDescription();
		medicineModel.cureFor=medicine.getCureFor();
		medicineModel.prescribedFor=medicine.getPrescribedFor();
		medicineModel.quantity=medicine.getQuantity();
		medicineModel.manufacturingCompany=medicine.getManufacturingCompany();
		medicineModel.dosage=medicine.getDosage();
		
		return medicineModel;
	}
	
	public Medicine medicineModelToEntity(MedicineModel medicineModel){
		medicine =new Medicine();
		
		medicine.setMedicineId(medicineModel.getMedicineId());
		medicine.setMedicineDescription(medicineModel.getMedicineDescription());
		medicine.setCureFor(medicineModel.getCureFor());
		medicine.setPrescribedFor(medicineModel.getPrescribedFor());
		medicine.setQuantity(medicineModel.getQuantity());
		medicine.setManufacturingCompany(medicineModel.getManufacturingCompany());
		medicine.setDosage(medicineModel.getDosage());
		
		return medicine;
		
	}
	
	public List<MedicineModel> medicineEntityToModelList(List<Medicine> medicineList){
		
		List<MedicineModel> medicineModelList=new ArrayList<MedicineModel>();
		for(int i=0;i<medicineList.size();i++)
		{
		
			medicineModelList.add(medicineEntityToModel(medicineList.get(i)));
		}
		return medicineModelList;
		
	}
	
	
}
