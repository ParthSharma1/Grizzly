package com.cognizant.service;

import java.util.List;

import com.cognizant.entity.MedicineRequest;
import com.cognizant.model.MedicineRequestModel;

public interface MedicineRequestService {
	boolean insertMedicineRequest(MedicineRequestModel medicineRequest);
    List<MedicineRequestModel> getMedicineRequests();
    boolean checkMedicineRequest(MedicineRequestModel medicineRequest);
    boolean updateBranchAdminRequest(MedicineRequestModel medicineRequest);
    MedicineRequestModel fetchMedicineRequestInfo(int requestId);
    List<String> getBranchAdminIds();
    List<Integer> getMedicineIds();
    int getRequestPendingCount();
    List<MedicineRequestModel> getApprovedRequests();
    List<MedicineRequestModel> getRejectedRequests();

}
