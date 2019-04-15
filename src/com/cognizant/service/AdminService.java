package com.cognizant.service;

import com.cognizant.model.AdminModel;

public interface AdminService {

	int validateAdmin(AdminModel admin);
	boolean registerAdmin(AdminModel admin);
	int checkAdminCredentials(AdminModel admin);
}
