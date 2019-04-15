package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.BranchAdminDAO;
import com.cognizant.entity.BranchAdmin;
import com.cognizant.model.BranchAdminModel;


@Service
public class BranchAdminServiceImpl implements BranchAdminService{

	@Autowired
	private BranchAdminDAO branchAdminDAO;
	@Autowired
	private BranchAdminModel branchAdminModel;
	public boolean insertBranchAdminDetails(BranchAdminModel branchAdmin) {
		// TODO Auto-generated method stub
		BranchAdmin branchAdminObj=branchAdminModel.branchAdminModelToEntity(branchAdmin);
		
		return branchAdminDAO.insertBranchAdmin(branchAdminObj);
	}

	public List<BranchAdminModel> getBranchAdminDetails() {
		// TODO Auto-generated method stub
		
		List<BranchAdmin> branchAdminList=branchAdminDAO.getBranchAdmin();
		
		List <BranchAdminModel> BranchAdminModel=branchAdminModel.branchAdminEntityToModelList(branchAdminList);
		return BranchAdminModel;
	}

	public int checkBranchAdminDetails(BranchAdminModel branchAdmin) {
		// TODO Auto-generated method stub
		
		BranchAdmin branchAdminObj =branchAdminModel.branchAdminModelToEntity(branchAdmin);
		return branchAdminDAO.checkBranchAdmin(branchAdminObj);
	}

	public boolean updateBranchAdminDetails(BranchAdminModel branchAdmin) {
		// TODO Auto-generated method stub
	
		BranchAdmin branchadmin=branchAdminModel.branchAdminModelToEntity(branchAdmin);
		
		return branchAdminDAO.updateBranchAdmin(branchadmin);
	}

	public BranchAdminModel getBranchAdminInfo(String branchAdminId) {
		// TODO Auto-generated method stub
		
		
		BranchAdmin branchAdmin= branchAdminDAO.fetchBranchAdminInfo(branchAdminId);
		
		BranchAdminModel BranchAdminModel=branchAdminModel.branchAdminEntityToModel(branchAdmin);
		
		return BranchAdminModel;
	}

	
}
