package com.cognizant.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.model.AdminModel;
import com.cognizant.model.BranchAdminModel;
import com.cognizant.model.MedicineModel;
import com.cognizant.model.MedicineRequestModel;
import com.cognizant.service.AdminService;
import com.cognizant.service.BranchAdminService;
import com.cognizant.service.MedicineRequestService;
import com.cognizant.service.MedicineService;
import com.cognizant.service.NotificationService;


@Controller
@SessionAttributes({"branchAdminUpdate","medicineRequest","updateMedicine","pendingCount"})
public class AdminController {
	private static final Logger logger=LoggerFactory.getLogger(AdminController.class);

	public AdminController(){}
	@Autowired
	private AdminService adminLoginService;
	
	@Autowired @Qualifier("AddMedicineValidator")
	private Validator addmedicineValidator;
	
	@Autowired
	private MedicineService medicineService;
	
	
	@Autowired
	private BranchAdminService branchAdminService;
	
	@Autowired
	private MedicineRequestService medicineRequestService;
	
	@Autowired
	private NotificationService notificationService;
	
	
	@Autowired@Qualifier("LoginValidator")
	private Validator loginValidator;
	
	@Autowired@Qualifier("RegisterValidator")
	private Validator registerValidator;
	
	@Autowired@Qualifier("BranchAdminValidator")
	private Validator branchAdminValidator;
	
	@RequestMapping(value="loginadmin.htm",method=RequestMethod.POST)
	public ModelAndView loginAdmin(@ModelAttribute("admin") AdminModel admin,Errors errors,HttpSession request){
		logger.info("In Admin Login Method");
		
		ModelAndView mv=new ModelAndView();
		
		ValidationUtils.invokeValidator(loginValidator,admin,errors);
		if(errors.hasErrors()){
			mv.setViewName("adminlogin");
			logger.info("Login Error..");
		}
		else{
		//	HttpSession session=request.getSession(false);
			//session.setAttribute("adminId",admin.getAdminId());
			mv.setViewName("home");
			logger.info("Login Successful..");
		}
		return mv;
	}

	@RequestMapping(value="index.htm",method=RequestMethod.GET)
	public String showLogin(HttpSession session){
		logger.info("redirect to Admin Login page..");
		return "adminlogin";
	}

	
	@ModelAttribute("admin")
	public AdminModel createAdminModelObject(){
			
		AdminModel adminModel=new AdminModel();
		return adminModel;
		
	}
	@RequestMapping(value="registerUser.htm",method=RequestMethod.POST)
	public ModelAndView registerAdmin(@ModelAttribute("admin") AdminModel admin,Errors errors) {

		ValidationUtils.invokeValidator(registerValidator, admin, errors);
		ModelAndView mv=new ModelAndView();
				
		if(errors.hasErrors()){
			mv.setViewName("register");
		}
		else{
			mv.setViewName("registersuccess");
		}
		return mv;	
	}
	
	@RequestMapping(value="register.htm",method=RequestMethod.POST)
	public ModelAndView getRegisteration(){
		ModelAndView mv=new ModelAndView();
		List<String> gender=new ArrayList<String>();
		gender.add("Male");
		gender.add("Female");
		mv.addObject("genderList",gender);
		mv.setViewName("register");
		return mv;
		
	}
	
	@RequestMapping(value="showbranchadminpage.htm",method=RequestMethod.GET)
	public ModelAndView showBranchAdminHome(){
		ModelAndView mv=new ModelAndView();
		List<BranchAdminModel> branchAdminList=branchAdminService.getBranchAdminDetails();
		mv.addObject("branchAdminList",branchAdminList); 
		mv.setViewName("branchadmin");
		return mv;
	}
	
	
	

	
	@RequestMapping(value="branchAdminDetails.htm",method=RequestMethod.GET)
	public ModelAndView showBranchAdminDetails(@RequestParam("branchAdminId")String branchAdminId,ModelMap map){
		ModelAndView mv=new ModelAndView();
		BranchAdminModel branchAdmin=branchAdminService.getBranchAdminInfo(branchAdminId);
		map.addAttribute("branchAdminUpdate",branchAdmin);
		mv.setViewName("branchadmindetails");
		return mv;
	}
	
	@RequestMapping(value="createbranchadmin.htm",method=RequestMethod.GET)
	public ModelAndView showCreateBranchAdmin(){
	System.out.println("-----------------branch admin page------------------");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("createbranchadmin");
		return mv;
		
	}
	@ModelAttribute("branchadmin")
	public BranchAdminModel createBranchAdminModelObject(){
			
		BranchAdminModel branchAdminModel=new BranchAdminModel();
		return branchAdminModel;
		
	}
	@RequestMapping(value="registerbranchadmin.htm",method=RequestMethod.POST)
	public ModelAndView createBranchAdmin(@ModelAttribute("branchadmin") BranchAdminModel branchAdmin,Errors errors) {
		

		ValidationUtils.invokeValidator(branchAdminValidator, branchAdmin, errors);
		ModelAndView mv=new ModelAndView();
				
		if(errors.hasErrors()){
			mv.setViewName("createbranchadmin");
		}
		else{
			List<BranchAdminModel> branchAdminList=branchAdminService.getBranchAdminDetails();
			mv.addObject("branchAdminList",branchAdminList); 
			mv.setViewName("branchadmin");

		}		
		return mv;	
	}
	
	@RequestMapping(value="showUpdateBranchAdminPage.htm",method=RequestMethod.GET)
	public ModelAndView showUpdateBranchAdminPage(){
	
		ModelAndView mv=new ModelAndView();
		mv.setViewName("updatebranchadmin");
		return mv;
		
	}
	
	@RequestMapping(value="updatebranchadmin.htm",method=RequestMethod.POST)
	public ModelAndView updateBranchAdmin(@ModelAttribute("branchadminUpdate") BranchAdminModel branchAdmin) {
		ModelAndView mv=new ModelAndView();
				
		boolean res=branchAdminService.updateBranchAdminDetails(branchAdmin);
		
		if(res==true)
		{
			List<BranchAdminModel> branchAdminList=branchAdminService.getBranchAdminDetails();
			mv.addObject("branchAdminList",branchAdminList); 
			mv.setViewName("branchadmin");

		}
		else
		{
			mv.setViewName("updatebranchadmin");
		}
		return mv;	
	}
	
	
			
	
	
	
	//BranchAdmin Request------------------------------------------
	
	
	@ModelAttribute("medicinerequest")
	public MedicineRequestModel createMedicineRequestModelObject(){	
		MedicineRequestModel requestModel=new MedicineRequestModel();
		return requestModel;	
	}
	
	
	@RequestMapping(value="showcreaterequestpage.htm",method=RequestMethod.GET)
	public ModelAndView showCreateRequestMedicinepage(){
		ModelAndView mv=new ModelAndView();
		List<String> branchAdminIdList=medicineRequestService.getBranchAdminIds();
		List<Integer> medicineIdList=medicineRequestService.getMedicineIds();
		mv.addObject("branchAdminIdList",branchAdminIdList);
		mv.addObject("medicineIdList",medicineIdList);
		mv.setViewName("createrequest");
		return mv;
	}
	
	
	@RequestMapping(value="createmedicinerequest.htm",method=RequestMethod.POST)
	public ModelAndView createMedicineRequest(@ModelAttribute("medicinerequest") MedicineRequestModel medicineRequest,ModelMap map) {
		ModelAndView mv=new ModelAndView();
		medicineRequest.setAdminResponse("P");
		boolean res=medicineRequestService.insertMedicineRequest(medicineRequest);
		
		if(res==true)
		{	
			List<MedicineRequestModel> medicineRequestList=medicineRequestService.getMedicineRequests();
			int pendingRequests=NotificationService.pendingRequestsCount;
			map.addAttribute("pendingCount",pendingRequests);
			mv.addObject("medicineRequestList",medicineRequestList); 
			mv.setViewName("showmedicinerequests");
		}
		else
		{
			mv.setViewName("createrequest");
		}
		return mv;	
	}
	
	@RequestMapping(value="showmedicinerequests.htm",method=RequestMethod.GET)
	public ModelAndView showMedicineRequests(ModelMap map){
		ModelAndView mv=new ModelAndView();
		List<MedicineRequestModel> medicineRequestList=medicineRequestService.getMedicineRequests();
		mv.addObject("medicineRequestList",medicineRequestList);
		notificationService.checkPendingRequests();
		int pendingRequests=NotificationService.pendingRequestsCount;
		map.addAttribute("pendingCount",pendingRequests);
		mv.setViewName("showmedicinerequests");
		return mv;
	}
	@RequestMapping(value="showapprovedrequests.htm",method=RequestMethod.GET)
	public ModelAndView showMedicineAprovedRequests(){
		ModelAndView mv=new ModelAndView();
		List<MedicineRequestModel> medicineRequestList=medicineRequestService.getApprovedRequests();
		mv.addObject("approvedList",medicineRequestList);
		mv.setViewName("approvedrequests");
		return mv;
	}
	
	@RequestMapping(value="showrejectedrequests.htm",method=RequestMethod.GET)
	public ModelAndView showRejectedRequests(ModelMap map){
		ModelAndView mv=new ModelAndView();
		List<MedicineRequestModel> medicineRequestList=medicineRequestService.getRejectedRequests();
		mv.addObject("rejectedList",medicineRequestList);
		mv.setViewName("rejectrequests");
		return mv;
	}
	
	@RequestMapping(value="updatestatusrequest.htm",method=RequestMethod.GET)
	public ModelAndView updateMedicineRequestsStatus(@RequestParam("requestId") int requestId,ModelMap map){
		ModelAndView mv=new ModelAndView();
		MedicineRequestModel medicineRequest=medicineRequestService.fetchMedicineRequestInfo(requestId);
		
		map.addAttribute("medicineRequest",medicineRequest); 
		mv.setViewName("medicinerequestupdate");
		return mv;
	}
	@RequestMapping(value="approvestatusrequest.htm",method=RequestMethod.POST)
	public ModelAndView approveMedicineRequestsStatus(@ModelAttribute("medicineRequest")MedicineRequestModel medicineRequest,ModelMap map){
		medicineRequest.setAdminResponse("A");
		ModelAndView mv=new ModelAndView();
		if(medicineRequestService.checkMedicineRequest(medicineRequest)){
			if(medicineRequestService.updateBranchAdminRequest(medicineRequest))
			{
				List<MedicineRequestModel> medicineRequestList=medicineRequestService.getMedicineRequests();
				int pendingRequests=NotificationService.pendingRequestsCount;
				map.addAttribute("pendingCount",pendingRequests);
				mv.addObject("medicineRequestList",medicineRequestList); 
				mv.setViewName("showmedicinerequests");
			}
			else {
				mv.setViewName("medicinerequestupdate");
			}
		}
		else {
			mv.addObject("message","stocks are not available");
		
			mv.setViewName("medicinerequestupdate");
		}
		
		return mv;
	}
	@RequestMapping(value="rejectstatusrequest.htm",method=RequestMethod.POST)
	public ModelAndView rejectMedicineRequestsStatus(@ModelAttribute("medicineRequest")MedicineRequestModel medicineRequest,ModelMap map){
		medicineRequest.setAdminResponse("R");
		ModelAndView mv=new ModelAndView();
		if(medicineRequestService.updateBranchAdminRequest(medicineRequest))
		{
			List<MedicineRequestModel> medicineRequestList=medicineRequestService.getMedicineRequests();
			int pendingRequests=NotificationService.pendingRequestsCount;
			map.addAttribute("pendingCount",pendingRequests);
			mv.addObject("medicineRequestList",medicineRequestList); 
			mv.setViewName("showmedicinerequests");
		}
		else {
			mv.setViewName("medicinerequestupdate");
		}
		
		return mv;
	}
	
	//---------------------------------------------------------------------------------------------------
	
	
	//Method to redirect to All Medicines Description Page 
	@RequestMapping(value="medicines.htm",method=RequestMethod.GET)
	public ModelAndView getallMedicines(){
		ModelAndView mv=new ModelAndView();
			List<MedicineModel> medList=medicineService.getAllMedicines();
				
			mv.addObject("medList", medList);
			mv.setViewName("allmedicines");
		
		return mv;
		
	}
		//Method to Store All the Data which user has entered 

		
		@RequestMapping(value="addMedicineData.htm",method=RequestMethod.GET)
		public ModelAndView addMedicine(@ModelAttribute ("medicine") MedicineModel medicine,Errors errors){
					
			ValidationUtils.invokeValidator(addmedicineValidator, medicine, errors);
			
				ModelAndView mv=new ModelAndView();
			
					
					if(errors.hasErrors()){
						mv.setViewName("addmedicines");
					}
					else{
						List<MedicineModel> medList=medicineService.getAllMedicines();
						
						mv.addObject("medList", medList);
						mv.setViewName("allmedicines");
					}
			return mv;
		}
		
		//----------------------------------------------------------------------------------------------	
		//Method to Redirect to Add Medicine Page
		
		
		@RequestMapping(value="addMedicine.htm",method=RequestMethod.GET)
		public String addMedicine(){
		//	logger.info("*****sayHello method call");
			return "addmedicines";
		}
		
		//----------------------------------------------------------------------------------------------
		//Method to redirect to medicine Quantity Update Page
		
		
		@RequestMapping(value="updatestockhere.htm",method=RequestMethod.GET)
		public ModelAndView updateMedicineStock(@RequestParam("MedicineId") String medicineId,ModelMap map){
			ModelAndView mv=new ModelAndView();
			
			MedicineModel medicineObj=medicineService.retrieveMedicine(medicineId);
			map.addAttribute("updateMedicine",medicineObj);
			mv.setViewName("medicinequantityupdate");
			return mv;
		
		}
		
		//----------------------------------------------------------------------------------------------
		//Method to update the values of a Existing value in DB
		
		
		@RequestMapping(value="medicinedetails.htm",method=RequestMethod.GET)
		public ModelAndView retrieveMedicineDetails(@RequestParam("MedicineId") String medicineId,ModelMap map){
		//	logger.info("*****sayHello method call");
			ModelAndView mv=new ModelAndView();
			MedicineModel medicineObj=medicineService.retrieveMedicine(medicineId);
			map.addAttribute("updateMedicine",medicineObj);
			mv.setViewName("medicinedetails");
			return mv;
		}
		
		
		//----------------------------------------------------------------------------------------------
		//Method for creating Medicine's object for injecting it in View
		
		
		@ModelAttribute("medicine")
		public MedicineModel createMedicineModelObject(){
				
			MedicineModel mediCineModel=new MedicineModel();
			return mediCineModel;
			
		}
		
		//----------------------------------------------------------------------------------------------
		//Method to redirect to Stock Updation Page
		
		
		@RequestMapping(value="updateStock.htm",method=RequestMethod.GET)
		public ModelAndView updateStocks(){
			ModelAndView mv=new ModelAndView();
			List<MedicineModel> stockList=medicineService.getStockList();
			mv.addObject("stockList", stockList);
			mv.setViewName("updatemedicinestock");
			return mv;
		}
		
		//----------------------------------------------------------------------------------------------
		//Method to redirect to the jsp page where we can update Medicine
		
		
		
		@RequestMapping(value="updateMedicine.htm",method=RequestMethod.GET)
		public ModelAndView updateMedicineData(){
			ModelAndView mv=new ModelAndView();
			mv.setViewName("updatemedicine");
			return mv;
			}
		
		//----------------------------------------------------------------------------------------------
		//Method to Persist the new object or updated object into DB with updated Quauntity
		
		@RequestMapping(value="updatemedicinequantity1.htm",method=RequestMethod.POST)
		public ModelAndView updateMedicinequantity(@ModelAttribute ("updateMedicine") MedicineModel medicine){
					ModelAndView mv=new ModelAndView();
					
					
					boolean result=medicineService.updateMedicineQuantity(medicine);
					if(result==true){
						List<MedicineModel> stockList=medicineService.getStockList();
						mv.addObject("stockList", stockList);
						mv.setViewName("updatemedicinestock");
					}
					else{
						mv.setViewName("medicinequantityupdate");
					}
			return mv;
		}
		
		//----------------------------------------------------------------------------------------------
		//Method to update Existing Medicine's Data
		
		
		@RequestMapping(value="updatemedicinedata.htm",method=RequestMethod.POST)
		public ModelAndView updateMedicine(@ModelAttribute ("medicine") MedicineModel medicine){
					ModelAndView mv=new ModelAndView();
			
					boolean result=medicineService.updateMedicine(medicine);
					if(result==true){
						List<MedicineModel> stockList=medicineService.getStockList();
						mv.addObject("stockList", stockList);
						mv.setViewName("updatemedicinestock");
					}
					else{
						mv.setViewName("updatemedicine");
					}
			return mv;
		}
}
