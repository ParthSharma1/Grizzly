package com.cognizant.service;

import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.MedicineRequestDAO;
import com.cognizant.entity.MedicineRequest;
import com.cognizant.model.MedicineRequestModel;

@Service("MedicineRequestServiceImpl")
public class MedicineRequestServiceImpl implements MedicineRequestService{

	@Autowired
	private MedicineRequestDAO medicineRequestDAO;
	
	@Autowired
	private MedicineRequestModel medicineRequestModel;
	
	public boolean insertMedicineRequest(MedicineRequestModel medicinerequest) {
		// TODO Auto-generated method stub
		
		MedicineRequest medicineRequest=medicineRequestModel.medicineRequestModelToEntity(medicinerequest);
		
		return medicineRequestDAO.insertMedicineRequest(medicineRequest);
	}

	public List<MedicineRequestModel> getMedicineRequests() {
		// TODO Auto-generated method stub
		List<MedicineRequest> medicineRequest=medicineRequestDAO.getMedicineRequests();
		List<MedicineRequestModel> medicineRequestModelList=medicineRequestModel.medicineRequestEntityToModelList(medicineRequest);
		
		return medicineRequestModelList;
	}

	public boolean checkMedicineRequest(MedicineRequestModel medicineRequest) {
		// TODO Auto-generated method stub
		Hashtable<Integer,Integer> hm=new Hashtable<Integer,Integer>();
		hm.put(medicineRequest.getMedicine1Id(), medicineRequest.getQuantity1());
		hm.put(medicineRequest.getMedicine2Id(), medicineRequest.getQuantity2());
		hm.put(medicineRequest.getMedicine3Id(), medicineRequest.getQuantity3());
		hm.put(medicineRequest.getMedicine4Id(), medicineRequest.getQuantity4());
		hm.put(medicineRequest.getMedicine5Id(), medicineRequest.getQuantity5());
		return medicineRequestDAO.checkMedicineRequest(hm);
	}

	public boolean updateBranchAdminRequest(MedicineRequestModel medicineRequest) {
		// TODO Auto-generated method stub
		MedicineRequest medicineRequestmodel=medicineRequestModel.medicineRequestModelToEntity(medicineRequest);
		
		return medicineRequestDAO.updateBranchAdminRequest(medicineRequestmodel);
	}

	public MedicineRequestModel fetchMedicineRequestInfo(int requestId) {
		// TODO Auto-generated method stub
		MedicineRequest medicineRequest=medicineRequestDAO.fetchMedicineRequestInfo(requestId);
		MedicineRequestModel medicineRequestmodel=medicineRequestModel.medicineRequestEntityToModel(medicineRequest);
		
		return medicineRequestmodel;
	}

	public List<String> getBranchAdminIds() {
		// TODO Auto-generated method stub
		return medicineRequestDAO.getBranchAdminIds();
	}

	public List<Integer> getMedicineIds() {
		// TODO Auto-generated method stub
		return medicineRequestDAO.getMedicineIds();
	}

	public int getRequestPendingCount() {
		// TODO Auto-generated method stub
		return medicineRequestDAO.getRequestPendingCount();
	}

	

	@Override
	public List<MedicineRequestModel> getApprovedRequests() {
		// TODO Auto-generated method stub
		List<MedicineRequest> medicineRequest=medicineRequestDAO.getApprovedRequests();
		List<MedicineRequestModel> medicineRequestModelList=medicineRequestModel.medicineRequestEntityToModelList(medicineRequest);
		
		return medicineRequestModelList;
	}

	@Override
	public List<MedicineRequestModel> getRejectedRequests() {
		// TODO Auto-generated method stub
		List<MedicineRequest> medicineRequest=medicineRequestDAO.getRejectedRequests();
		List<MedicineRequestModel> medicineRequestModelList=medicineRequestModel.medicineRequestEntityToModelList(medicineRequest);
		
		return medicineRequestModelList;
	}

	

}
