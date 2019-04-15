package com.cognizant.junit;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.controller.AdminController;
import com.cognizant.dao.AdminDAOImpl;
import com.cognizant.dao.MedicineDAO;
import com.cognizant.entity.Admin;
import com.cognizant.entity.BranchAdmin;
import com.cognizant.entity.Medicine;
import com.cognizant.entity.MedicineRequest;
import com.cognizant.helper.SessionCreator;
import com.cognizant.model.AdminModel;
import com.cognizant.model.BranchAdminModel;
import com.cognizant.service.AdminService;
import com.cognizant.service.AdminServiceImpl;
import com.cognizant.service.BranchAdminService;
import com.cognizant.service.MedicineRequestService;
import com.cognizant.service.MedicineService;
import com.cognizant.service.NotificationService;
import com.cognizant.validation.AddMedicineValidator;
import com.cognizant.validation.LoginValidator;
import com.cognizant.validation.RegisterValidator;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/config/applicationContext.xml")
public class TestAdminController {

	private MockMvc mockMvc;
	
	@Autowired
	@Mock
	private SessionCreator sessionCreator;

	@Autowired
	@Mock
	private AdminDAOImpl adminDAOImpl;
	
	@Autowired
	@Mock
	private AdminService adminService;
	
	 @Mock
	 HttpSession httpSession;
	 @Autowired
	 @Spy @Qualifier("LoginValidator")
	 private LoginValidator loginValidator; 
	
	 @Autowired @Qualifier("AddMedicineValidator")
	 @Mock
		private AddMedicineValidator addmedicineValidator;
		
		@Autowired
		@Mock
		private MedicineService medicineService;
	 
		@Autowired
		@Spy
		private BranchAdminService branchAdminService;
		
		@Autowired
		@Mock
		private MedicineRequestService medicineRequestService;
		
		@Autowired
		@Spy
		private AdminServiceImpl adminServiceimpl;
		
		
		@Autowired@Qualifier("RegisterValidator")
		@Spy
		private RegisterValidator registerValidator;
		
		@Autowired@Qualifier("BranchAdminValidator")
		@Mock
	   private Validator branchAdminValidator;
	 
	@Autowired
private SessionFactory sessionFactory;
	
	@Autowired
	@Mock
	private NotificationService notificationService;
	

		
	@InjectMocks
	private AdminController adminController;
	
	
	@Before
	public void setUp(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(adminController)
                .build();
    
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testLoginAdmin() {
			AdminModel admin = new AdminModel();
			admin.setAdminId("2");
			admin.setAdminPassword("tree");
			Errors errors= new BeanPropertyBindingResult("1","com.cognizant.controller.wrongAdminId");
	    	ModelAndView mv=adminController.loginAdmin(admin,errors,httpSession);
	    	String actual=mv.getViewName();
	    	String expected="home";
	    	assertEquals(expected,actual);
	    	}

	@Test
	public void testShowLogin() {
		
		String expected="adminlogin";
		String actual=adminController.showLogin(httpSession);
		assertEquals(expected,actual);
	}


	

	@Test
	public void testRegisterAdmin() {
		AdminModel admin=new AdminModel();
		admin.setAdminFirstName("adminFname");
		admin.setAdminLastName("adminLastName");
		admin.setAdminAge(21);
		admin.setAdminDOB("21/11/7895");
		admin.setAdminGender("M");
		admin.setAdminAltContactNo("4567891230");
		admin.setAdminPassword("50822010");
		admin.setAdminContactNo("9013456789");
		admin.setAdminEmailId("mailId@gmial.com");
	
		
		System.out.println(admin.getAdminId());
		Errors errors= new BeanPropertyBindingResult("3","com.cognizant.controller.wrongAdminContactNo");
		
		ModelAndView mv=adminController.registerAdmin(admin,errors);
		String actual=mv.getViewName();
    	String expected="registersuccess";
		assertEquals(actual,expected);
	
	}
	
	
	
	
	@Test
	public void testShowBranchAdminHome() {
			
		ModelAndView modelAndView= adminController.showBranchAdminHome();
		
		String result=modelAndView.getViewName();
		String expected="branchadmin";
		assertEquals(expected,result);	
		
	}
	
	

	@Test
	public void testShowCreateRequestMedicinepage() {
		try{
			ModelAndView mv = adminController.showCreateRequestMedicinepage();
//		List<String> branchAdminIdList=medicineRequestService.getBranchAdminIds();
	//	List<Integer> medicineIdList=medicineRequestService.getMedicineIds();
	//	boolean res1=branchAdminIdList.isEmpty();
		//boolean res2=medicineIdList.isEmpty();
		String actual = mv.getViewName();
		String expected = "createrequest";
		assertEquals(actual,expected);
		}catch(Exception e){
			fail("Something Went Wrong");
		}
			
	}
	
	
	@Test
	public void testShowBranchAdminDetails() {
		ModelMap map=new ModelMap();
		Errors errors= new BeanPropertyBindingResult("3","com.cognizant.controller.wrongAdminContactNo");
		ModelAndView mv= adminController.showBranchAdminDetails("branch29",map);
		String expected="branchadmindetails";
		String actual=mv.getViewName();
		assertEquals(actual,expected);
		
	}
	
	
	
	@Test
	public void testCreateBranchAdmin() {
		 
		try{
			
		ModelAndView mv=adminController.showCreateBranchAdmin();
		 String res=mv.getViewName();
		 String actual="createbranchadmin";
		 
		 assertEquals(res,actual);
	}catch(Exception e){
		fail("something went wrong");
	
		}
	}
	@Test
	public void testGetRegisteration() {
		ModelAndView mv=adminController.getRegisteration();
		String res=mv.getViewName();
		
		String expected="register";
		
		assertEquals(res,expected);
	}
	
	

	
	
@Test
	public void testUpdateBranchAdmin() {
		
	 BranchAdminModel branchAdminModel=new BranchAdminModel();
	 
		branchAdminModel.setBranchAdminFirstName("sad");
		branchAdminModel.setBranchAdminLastName("mad");
		branchAdminModel.setBranchAdminAge(55);
		branchAdminModel.setBranchAdminGender("M");
		branchAdminModel.setBranchAdminDOB("45/8/12");
		branchAdminModel.setBranchAdminContactNo("80258963");
		branchAdminModel.setBranchAdminAltContactNo("152630879");
		branchAdminModel.setBranchAdminEmailId("admin@gmail.com");
		branchAdminModel.setBranchName("Bname");
		branchAdminModel.setAddressLine1("ALine1");
		branchAdminModel.setAddressLine2("ALine2");
		branchAdminModel.setCity("City");
		branchAdminModel.setState("State");
		branchAdminModel.setZipCode("zip");
		branchAdminModel.setBranchAdminId("branch29");
	ModelAndView mv=adminController.updateBranchAdmin(branchAdminModel);
	String actual="branchadmin";
	String expected=mv.getViewName();
	assertEquals(actual,expected);
	}
	
	@Test
	public void testGetallMedicines() {
		ModelAndView mv=adminController.getallMedicines();
		String actual=mv.getViewName();
		String expected="allmedicines";
		assertEquals(actual,expected);
	
	}
	
	
/*

	

	

	

	@Test
	public void testRejectMedicineRequestsStatus() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMedicineMedicineModelErrors() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMedicine() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateMedicineStock() {
		fail("Not yet implemented");
	}

	@Test
	public void testRetrieveMedicineDetails() {
		fail("Not yet implemented");
	}



	@Test
	public void testCreateMedicineModelObject() {
		fail("Not yet implemented");
	}

	

	@Test
	public void testUpdateMedicineData() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateMedicinequantity() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateMedicine() {
		fail("Not yet implemented");
	}*/

}
