package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Null;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Branch_Admin_Request")
public class MedicineRequest {

	@Id
	@GenericGenerator(name="MedicineRequestId",
    strategy="com.cognizant.dao.MedicineRequestIdGenerator")
    @GeneratedValue(generator="MedicineRequestId")
	@Column(name="Request_Id")
	private int requestId;
	
	@Column(name="Branch_Admin_Id")
	private String branchAdminId;
	
	@Column(name="Request_Date")
	private String requestDate;
	
	@Column(name="Medicine_Id_1")
	private int medicine1Id;
	
	@Column(name="Quantity1")
	private int quantity1;
	
	
	@Column(name="Medicine_Id_2")
	private int medicine2Id;
	
	
	@Column(name="Quantity2")
	private int quantity2;
	
	//@Null
	@Column(name="Medicine_Id_3")
	private int medicine3Id;
	
	//@Null
	@Column(name="Quantity3")
	private int quantity3;
	
	//@Null
	@Column(name="Medicine_Id_4")
	private int medicine4Id;
	
	//@Null
	@Column(name="Quantity4")
	private int quantity4;
	
	//@Null
	@Column(name="Medicine_Id_5")
	private int medicine5Id;
	
	//@Null
	@Column(name="Quantity5")
	private int quantity5;
	
	//@Null
	@Column(name="Other_Info")
	private String otherInfo;
	
	//@Null
	@Column(name="Admin_Process_Date")
	private String adminProcessDate;
	
	//@Null
	@Column(name="Admin_Response")
	private String adminResponse;
	
	//@Null
	@Column(name="Admin_Remarks")
	private String adminRemarks;
	
	public int getRequestId() {
		return requestId;
	}



	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}



	public String getBranchAdminId() {
		return branchAdminId;
	}



	public void setBranchAdminId(String branchAdminId) {
		this.branchAdminId = branchAdminId;
	}



	public String getRequestDate() {
		return requestDate;
	}



	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}



	public int getMedicine1Id() {
		return medicine1Id;
	}



	public void setMedicine1Id(int medicine1Id) {
		this.medicine1Id = medicine1Id;
	}



	public int getQuantity1() {
		return quantity1;
	}



	public void setQuantity1(int quantity1) {
		this.quantity1 = quantity1;
	}



	public int getMedicine2Id() {
		return medicine2Id;
	}



	public void setMedicine2Id(int medicine2Id) {
		this.medicine2Id = medicine2Id;
	}



	public int getQuantity2() {
		return quantity2;
	}



	public void setQuantity2(int quantity2) {
		this.quantity2 = quantity2;
	}



	public int getMedicine3Id() {
		return medicine3Id;
	}



	public void setMedicine3Id(int medicine3Id) {
		this.medicine3Id = medicine3Id;
	}



	public int getQuantity3() {
		return quantity3;
	}



	public void setQuantity3(int quantity3) {
		this.quantity3 = quantity3;
	}



	public int getMedicine4Id() {
		return medicine4Id;
	}



	public void setMedicine4Id(int medicine4Id) {
		this.medicine4Id = medicine4Id;
	}



	public int getQuantity4() {
		return quantity4;
	}



	public void setQuantity4(int quantity4) {
		this.quantity4 = quantity4;
	}



	public int getMedicine5Id() {
		return medicine5Id;
	}



	public void setMedicine5Id(int medicine5Id) {
		this.medicine5Id = medicine5Id;
	}



	public int getQuantity5() {
		return quantity5;
	}



	public void setQuantity5(int quantity5) {
		this.quantity5 = quantity5;
	}



	public String getOtherInfo() {
		return otherInfo;
	}



	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}



	public String getAdminProcessDate() {
		return adminProcessDate;
	}



	public void setAdminProcessDate(String adminProcessDate) {
		this.adminProcessDate = adminProcessDate;
	}



	public String getAdminResponse() {
		return adminResponse;
	}



	public void setAdminResponse(String adminResponse) {
		this.adminResponse = adminResponse;
	}



	public String getAdminRemarks() {
		return adminRemarks;
	}



	public void setAdminRemarks(String adminRemarks) {
		this.adminRemarks = adminRemarks;
	}




	
	public MedicineRequest() {
		// TODO Auto-generated constructor stub
	int requestId;
		
	}

}
