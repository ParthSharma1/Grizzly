package com.cognizant.junit;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.cognizant.dao.MedicineDAOImpl;
import com.cognizant.entity.Medicine;


@ContextConfiguration(locations="classpath:/config/applicationContext.xml")
public class TestMedicineDao {


	private SessionFactory sessionFactory;
	
	@Mock
	private ApplicationContext ioc;
	@Mock
	private SessionFactory mockedSessionFactory;
	@Mock
	private Session mockedSession;
	@Mock
	private Transaction mockedTransaction;
	@Mock
	private Query mockedQuery;
	@Mock
	private List<Medicine> mockedProductList;
	@Mock
	private Medicine medicine;

	@InjectMocks
	private MedicineDAOImpl medicineDaoImpl;

	private MedicineDAOImpl medicineDaoImpl1;

	
	
	@Before
	public void setUp() throws Exception {
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
