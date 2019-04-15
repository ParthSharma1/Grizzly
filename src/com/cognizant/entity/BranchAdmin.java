package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Branch_Admin")
public class BranchAdmin {
    
	@Id
	@GenericGenerator(name="BRANCHADMINSEQ",
    strategy="com.cognizant.dao.BranchAdminIdGenerator")
    @GeneratedValue(generator="BRANCHADMINSEQ")
    @Column(name="Branch_Admin_Id")
	private String branchAdminId;
	
	@Column(name="First_Name")
	private String branchAdminFirstName;
	
	@Column(name="Last_Name")
	private String branchAdminLastName;
	
	@Column(name="Age")
	private int branchAdminAge;
	
	@Column(name="Gender")
	private String branchAdminGender;
	
	@Column(name="DOB")
	private String branchAdminDOB;
	
	@Column(name="Contact_Number")
	private String branchAdminContactNo;
	
	@Column(name="Alt_Contact_Number")
	private String branchAdminAltContactNo;
	
	@Column(name="Email_Id")
	private String branchAdminEmailId;
	
	@Column(name="Branch_Name")
	private String branchName;
	
	@Column(name="Address_Line_1")
	private String addressLine1;
	
	@Column(name="Address_Line_2")
	private String addressLine2;
	
	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;
	
	@Column(name="Zip_Code")
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

	public void setBranchAdminContactNo(String branchAdminContachNo) {
		this.branchAdminContactNo = branchAdminContachNo;
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


	
	
}
