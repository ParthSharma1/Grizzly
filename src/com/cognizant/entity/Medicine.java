package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Medicine")
public class Medicine {
	@Id 
	@GenericGenerator(name="MedicineIdSeq",
    strategy="com.cognizant.dao.MedicineIdGenerator")
    @GeneratedValue(generator="MedicineIdSeq")
	@Column(name="Medicine_Id")
	private int medicineId;
	@Column(name="Medicine_Description")
	private String medicineDescription;
	@Column(name="Cure_For")
	private String cureFor;
	@Column(name="Manufacturing_Company")
	private String manufacturingCompany;
	@Column(name="Dosage")
	private int dosage;
	@Column(name="Prescribed_For")
	private String prescribedFor;
	@Column(name="Quantity")
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

		
}
