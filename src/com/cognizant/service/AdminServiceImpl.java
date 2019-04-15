package com.cognizant.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.*;
import com.cognizant.entity.Admin;
import com.cognizant.model.AdminModel;
@Service
public class AdminServiceImpl implements AdminService {
public AdminServiceImpl(){}
	@Autowired 
	private AdminDAO adminDAO;
	@Autowired
	private AdminModel adminmodel;
	
	public int validateAdmin(AdminModel admin) {
		// TODO Auto-generated method stub
		
		Admin adminObj=adminmodel.adminModelToEntity(admin);
		System.out.println(adminObj.getAdminId());
		return adminDAO.getAdminDetails(adminObj);
		
	}
	public boolean registerAdmin(AdminModel admin) {
		System.out.println(admin.getAdminId());
		Admin adminObj=adminmodel.adminModelToEntity(admin);
		
		
		return adminDAO.registerAdmin(adminObj);
	}
	public int checkAdminCredentials(AdminModel admin) {
		// TODO Auto-generated method stub
		
		Admin adminObj=adminmodel.adminModelToEntity(admin);
		return adminDAO.checkAdmin(adminObj);
	}

}
