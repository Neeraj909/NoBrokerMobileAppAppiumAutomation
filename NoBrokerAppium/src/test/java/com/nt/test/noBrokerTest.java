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

public class noBrokerTest extends NoBokerRepo {
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
	
	@AfterSuite
	public void afterSuite() {
		getAppiumDriver().close();
		getService().stop();
		
	}

}
