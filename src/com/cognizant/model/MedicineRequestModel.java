package com.cognizant.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.entity.Medicine;
import com.cognizant.entity.MedicineRequest;
@Component
public class MedicineRequestModel {

private int requestId;
	

	MedicineRequest medicineRequest;
	MedicineRequestModel medicineRequestModel;

	private String branchAdminId;
	
	private String requestDate;
	
	private int medicine1Id;
	
	private int quantity1;
		
	private int medicine2Id;
		
	private int quantity2;
		
	private int medicine3Id;
		
	private int quantity3;
		
	private int medicine4Id;
		
	private int quantity4;
		
	private int medicine5Id;
		
	private int quantity5;
		
	private String otherInfo;
		
	private String adminProcessDate;
		
	private String adminResponse;
		
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

	public MedicineRequestModel medicineRequestEntityToModel(MedicineRequest medicineRequest){
		medicineRequestModel=new MedicineRequestModel();
		medicineRequestModel.requestId=medicineRequest.getRequestId();
		medicineRequestModel.branchAdminId=medicineRequest.getBranchAdminId();
		medicineRequestModel.requestDate=medicineRequest.getRequestDate();
		medicineRequestModel.medicine1Id=medicineRequest.getMedicine1Id();
		medicineRequestModel.quantity1=medicineRequest.getQuantity1();
		medicineRequestModel.medicine2Id=medicineRequest.getMedicine2Id();
		medicineRequestModel.quantity2=medicineRequest.getQuantity2();
		medicineRequestModel.medicine3Id=medicineRequest.getMedicine3Id();
		medicineRequestModel.quantity3=medicineRequest.getQuantity3();
		medicineRequestModel.medicine4Id=medicineRequest.getMedicine4Id();
		medicineRequestModel.quantity4=medicineRequest.getQuantity4();
		medicineRequestModel.medicine5Id=medicineRequest.getMedicine5Id();
		medicineRequestModel.quantity5=medicineRequest.getQuantity5();
		medicineRequestModel.otherInfo=medicineRequest.getOtherInfo();
		medicineRequestModel.adminProcessDate=medicineRequest.getAdminProcessDate();
		medicineRequestModel.adminResponse=medicineRequest.getAdminResponse();
		
		return medicineRequestModel;
		
	}
	
	public MedicineRequest medicineRequestModelToEntity(MedicineRequestModel medicineRequestModel){
	
			medicineRequest=new MedicineRequest();
			medicineRequest.setRequestId(medicineRequestModel.getRequestId());
			medicineRequest.setBranchAdminId(medicineRequestModel.getBranchAdminId());
			medicineRequest.setRequestDate(medicineRequestModel.getRequestDate());
			medicineRequest.setMedicine1Id(medicineRequestModel.getMedicine1Id());
			medicineRequest.setQuantity1(medicineRequestModel.getQuantity1());
			medicineRequest.setMedicine2Id(medicineRequestModel.getMedicine2Id());
			medicineRequest.setQuantity2(medicineRequestModel.getQuantity2());
			medicineRequest.setMedicine3Id(medicineRequestModel.getMedicine3Id());
			medicineRequest.setQuantity3(medicineRequestModel.getQuantity3());
			medicineRequest.setMedicine4Id(medicineRequestModel.getMedicine4Id());
			medicineRequest.setQuantity4(medicineRequestModel.getQuantity4());
			medicineRequest.setMedicine5Id(medicineRequestModel.getMedicine5Id());
			medicineRequest.setQuantity5(medicineRequestModel.getQuantity5());
			medicineRequest.setOtherInfo(medicineRequestModel.getOtherInfo());
			medicineRequest.setAdminProcessDate(medicineRequestModel.getAdminProcessDate());
			medicineRequest.setAdminResponse(medicineRequestModel.getAdminResponse());
		
		return medicineRequest;
		
	}
	
	public List<MedicineRequestModel> medicineRequestEntityToModelList(List<MedicineRequest> medicineRequestList){
		
		List<MedicineRequestModel> medicineRequestModelList=new ArrayList<>();
		 for(int i=0;i<medicineRequestList.size();i++)
		 {
			 
			 medicineRequestModelList.add(medicineRequestEntityToModel(medicineRequestList.get(i)));
		 }
		
		
		return medicineRequestModelList;
		
	}
	
}
