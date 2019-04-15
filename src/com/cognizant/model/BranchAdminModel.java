package com.cognizant.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.entity.BranchAdmin;
@Component
public class BranchAdminModel {

	
private String branchAdminId;
	
	BranchAdmin branchAdmin;
	BranchAdminModel branchAdminModel;

	
	private String branchAdminFirstName;
	
	
	private String branchAdminLastName;
	
	
	private int branchAdminAge;
	
	
	private String branchAdminGender;
	
	private String branchAdminDOB;
	
	
	private String branchAdminContactNo;
	
	
	private String branchAdminAltContactNo;
	
	
	private String branchAdminEmailId;
	
	
	private String branchName;
	
	
	private String addressLine1;
	
	
	private String addressLine2;
	
	private String city;
	
	
	private String state;
	
	private String zipCode;

	public String getBranchAdminId() {
		return branchAdminId;
	}

	public void setBranchAdminId(String branchAdminId) {
		this.branchAdminId = branchAdminId;
	}

	public String getBranchAdminFirstName() {
		return branchAdminFirstName;
	}

	public void setBranchAdminFirstName(String branchAdminFirstName) {
		this.branchAdminFirstName = branchAdminFirstName;
	}

	public String getBranchAdminLastName() {
		return branchAdminLastName;
	}

	public void setBranchAdminLastName(String branchAdminLastName) {
		this.branchAdminLastName = branchAdminLastName;
	}

	public int getBranchAdminAge() {
		return branchAdminAge;
	}

	public void setBranchAdminAge(int branchAdminAge) {
		this.branchAdminAge = branchAdminAge;
	}

	public String getBranchAdminGender() {
		return branchAdminGender;
	}

	public void setBranchAdminGender(String branchAdminGender) {
		this.branchAdminGender = branchAdminGender;
	}

	public String getBranchAdminDOB() {
		return branchAdminDOB;
	}

	public void setBranchAdminDOB(String branchAdminDOB) {
		this.branchAdminDOB = branchAdminDOB;
	}

	public String getBranchAdminContactNo() {
		return branchAdminContactNo;
	}

	public void setBranchAdminContactNo(String branchAdminContactNo) {
		this.branchAdminContactNo = branchAdminContactNo;
	}

	public String getBranchAdminAltContactNo() {
		return branchAdminAltContactNo;
	}

	public void setBranchAdminAltContactNo(String branchAdminAltContactNo) {
		this.branchAdminAltContactNo = branchAdminAltContactNo;
	}

	public String getBranchAdminEmailId() {
		return branchAdminEmailId;
	}

	public void setBranchAdminEmailId(String branchAdminEmailId) {
		this.branchAdminEmailId = branchAdminEmailId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	public BranchAdminModel branchAdminEntityToModel(BranchAdmin branchAdmin){
			branchAdminModel =new BranchAdminModel();
			
			branchAdminModel.branchAdminId=branchAdmin.getBranchAdminId();
			branchAdminModel.branchAdminFirstName=branchAdmin.getBranchAdminFirstName();
			branchAdminModel.branchAdminLastName=branchAdmin.getBranchAdminLastName();
			branchAdminModel.branchAdminAge=branchAdmin.getBranchAdminAge();
			branchAdminModel.branchAdminGender=branchAdmin.getBranchAdminGender();
			branchAdminModel.branchAdminDOB=branchAdmin.getBranchAdminDOB();
			branchAdminModel.branchAdminContactNo=branchAdmin.getBranchAdminContactNo();
			branchAdminModel.branchAdminAltContactNo=branchAdmin.getBranchAdminAltContactNo();
			branchAdminModel.branchAdminEmailId=branchAdmin.getBranchAdminEmailId();
			branchAdminModel.branchName=branchAdmin.getBranchName();
			branchAdminModel.addressLine1=branchAdmin.getAddressLine1();
			branchAdminModel.addressLine2=branchAdmin.getAddressLine2();
			branchAdminModel.city=branchAdmin.getCity();
			branchAdminModel.state=branchAdmin.getState();
			branchAdminModel.zipCode=branchAdmin.getZipCode();
		
		
		return branchAdminModel;
		
	}
	
	public BranchAdmin branchAdminModelToEntity(BranchAdminModel branchAdminModel){
			branchAdmin= new BranchAdmin();
			branchAdmin.setBranchAdminId(branchAdminModel.getBranchAdminId());
			branchAdmin.setBranchAdminFirstName(branchAdminModel.getBranchAdminFirstName());
			branchAdmin.setBranchAdminLastName(branchAdminModel.getBranchAdminLastName());
			branchAdmin.setBranchAdminAge(branchAdminModel.getBranchAdminAge());
			branchAdmin.setBranchAdminGender(branchAdminModel.getBranchAdminGender());
			branchAdmin.setBranchAdminDOB(branchAdminModel.getBranchAdminDOB());
			branchAdmin.setBranchAdminContactNo(branchAdminModel.getBranchAdminContactNo());
			branchAdmin.setBranchAdminAltContactNo(branchAdminModel.getBranchAdminAltContactNo());
			branchAdmin.setBranchAdminEmailId(branchAdminModel.getBranchAdminEmailId());
			branchAdmin.setBranchName(branchAdminModel.getBranchName());
			branchAdmin.setAddressLine1(branchAdminModel.getAddressLine1());
			branchAdmin.setAddressLine2(branchAdminModel.getAddressLine2());
			branchAdmin.setCity(branchAdminModel.getCity());
			branchAdmin.setState(branchAdminModel.getState());
			branchAdmin.setZipCode(branchAdminModel.getZipCode());
		return branchAdmin;
		
	}
	public List<BranchAdminModel> branchAdminEntityToModelList(List<BranchAdmin> branchAdminList){
		
		List<BranchAdminModel> branchAdminModelList=new ArrayList<BranchAdminModel>();
		 for(int i=0;i<branchAdminList.size();i++)
		 {
			
			 branchAdminModelList.add(branchAdminEntityToModel(branchAdminList.get(i)));
		 }
		
		
		return branchAdminModelList;
		
	}
	
}
