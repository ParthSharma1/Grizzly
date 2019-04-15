package com.cognizant.model;

import org.springframework.stereotype.Component;

import com.cognizant.entity.Admin;
@Component
public class AdminModel {
		
	public AdminModel(){}
	AdminModel adminModel=null;
	Admin admin=null;
	
	
	
    private String adminId;

	private String adminFirstName;
    
   	private String adminLastName;
    
   	private String adminGender;
    
    private int adminAge;
    
    private String adminDOB;
    
    private String adminContactNo;
    
    private String adminAltContactNo;
    
    private String adminEmailId;
    
    private String adminPassword;

	
    public AdminModel(String adminId, String adminPassword) {
    	super();
    	this.adminId = adminId;
    	this.adminPassword = adminPassword;
    }
    
    
    public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminFirstName() {
		return adminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public String getAdminGender() {
		return adminGender;
	}

	public void setAdminGender(String adminGender) {
		this.adminGender = adminGender;
	}

	public int getAdminAge() {
		return adminAge;
	}

	public void setAdminAge(int adminAge) {
		this.adminAge = adminAge;
	}

	public String getAdminDOB() {
		return adminDOB;
	}

	public void setAdminDOB(String adminDOB) {
		this.adminDOB = adminDOB;
	}

	public String getAdminContactNo() {
		return adminContactNo;
	}

	public void setAdminContactNo(String adminContactNo) {
		this.adminContactNo = adminContactNo;
	}

	public String getAdminAltContactNo() {
		return adminAltContactNo;
	}

	public void setAdminAltContactNo(String adminAltContactNo) {
		this.adminAltContactNo = adminAltContactNo;
	}

	public String getAdminEmailId() {
		return adminEmailId;
	}

	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	
	public AdminModel adminEntityToModel(Admin admin){
				adminModel=new AdminModel();
				
				System.out.println("into Model Class of Admin");
				
				
			adminModel.adminId=admin.getAdminId();
			adminModel.adminFirstName=admin.getAdminFirstName();
			adminModel.adminLastName=admin.getAdminLastName();
			adminModel.adminGender=admin.getAdminGender();
			adminModel.adminDOB=admin.getAdminDOB();
			adminModel.adminPassword=admin.getAdminPassword();
			adminModel.adminEmailId=admin.getAdminEmailId();
			adminModel.adminContactNo=admin.getAdminContactNo();
			adminModel.adminAltContactNo=admin.getAdminAltContactNo();
		
		return adminModel;
		
	}
	
	public Admin adminModelToEntity(AdminModel adminModel){
		
		
			System.out.println("into conversion of model to entity class ");
				admin=new Admin();
				admin.setAdminId(adminModel.getAdminId());
				admin.setAdminFirstName(adminModel.getAdminFirstName());
				admin.setAdminLastName(adminModel.getAdminLastName());
				admin.setAdminGender(adminModel.getAdminGender());
				admin.setAdminDOB(adminModel.getAdminDOB());
				admin.setAdminPassword(adminModel.getAdminPassword());
				admin.setAdminEmailId(adminModel.getAdminEmailId());
				admin.setAdminContactNo(adminModel.getAdminContactNo());
				admin.setAdminAltContactNo(adminModel.getAdminAltContactNo());
		
		
		return admin;
		
	}
	
}
