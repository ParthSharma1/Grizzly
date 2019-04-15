package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Admin")
public class Admin {
	
	public Admin(){}
    @Id
    @GenericGenerator(name="ADMINSEQ",
    strategy="com.cognizant.dao.AdminIdGenerator")
    @GeneratedValue(generator="ADMINSEQ")
    @Column(name="AdminID")
	private String adminId;

    @Column(name="First_Name")
	private String adminFirstName;
    
    @Column(name="Last_Name")
	private String adminLastName;
    
    @Column(name="Gender")
	private String adminGender;
    
    @Column(name="Age")
	private int adminAge;
    
    @Column(name="DOB")
    private String adminDOB;
    
    @Column(name="Contact_Number")
    private String adminContactNo;
    
    @Column(name="Alt_Contact_Number")
    private String adminAltContactNo;
    
    @Column(name="Email_Id")
    private String adminEmailId;
    
    @Column(name="Password")
    private String adminPassword;
    
    public Admin(String adminId, String adminPassword) {
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
    
	
}
