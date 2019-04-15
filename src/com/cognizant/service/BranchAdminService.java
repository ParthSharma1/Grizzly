package com.cognizant.service;

import java.util.List;

import com.cognizant.entity.BranchAdmin;
import com.cognizant.model.BranchAdminModel;

public interface BranchAdminService {

	boolean insertBranchAdminDetails(BranchAdminModel branchAdmin);
    List<BranchAdminModel> getBranchAdminDetails();
    int checkBranchAdminDetails(BranchAdminModel branchAdmin);
    boolean updateBranchAdminDetails(BranchAdminModel branchAdmin);
    BranchAdminModel getBranchAdminInfo(String branchAdminId);
}
