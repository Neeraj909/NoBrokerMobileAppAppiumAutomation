package com.nt.test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nt.actions.NoBrokerUIActions;
import com.nt.repo.NoBokerRepo;
import com.nt.utills.CommonUtills;

public class nobrokerTest extends NoBokerRepo {
	NoBrokerUIActions noBrokerUIactions;
	@Parameters("env")
	@BeforeSuite
	public void beforeTest(@Optional("env") String env) throws Exception {
		CommonUtills.setEnv(env);
		setDesiredCapabilities();
		noBrokerUIactions = new NoBrokerUIActions();
		CommonUtills.cleanFolder();
	}

	@Test(priority = 1, dataProvider = "Production")
	public void packerMoverDesktop(String city, String searchArea, String areaOne, String areaTwo, String prefrence)
			throws InterruptedException {
		noBrokerUIactions.searchPropertyAction(city, searchArea, areaOne, areaTwo, prefrence);

	}

	@DataProvider(name = "Production")
	public Object[][] data() {
		Object[][] arrayObject = CommonUtills.getTestData("Sheet1");
		return arrayObject;
	}
	@Test
	public void m1() {
		System.out.println("dwws");
	}
	@Test
	public void m2() {
		System.out.println("dsxsxwws");
	}
	@Test
	public void m3() {
		int i=2/0;
	}
	@Test
	public void m4() {
		int i=2/0;
	}
	@AfterSuite
	public void afterSuite() {
		
	}

}
