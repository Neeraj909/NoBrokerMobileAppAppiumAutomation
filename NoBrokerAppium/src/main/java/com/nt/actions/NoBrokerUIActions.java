package com.nt.actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.nt.repo.NoBokerRepo;

import io.appium.java_client.MobileElement;

public class NoBrokerUIActions extends NoBokerRepo {
	public void selectPrefrencetype(String prefrence) {
		String type[] = prefrence.split("&");
		for (String s1 : type)
			for (int i = 1; i <= 2; i++) 
				for (MobileElement ele : selectPrefrence(i)) 
					if (ele.getText().equals(s1)) 
						ele.click();
					

	}
	public void selectDropdownValues(String city ) {
		for (MobileElement ele : dropDownCity()) {
			if (ele.getText().trim().contains(city.trim())) {
				ele.click();
				break;
			}
		}
	}
	public void searchPropertyAction(String city, String searchArea, String areaOne, String areaTwo, String prefrence) throws InterruptedException {
		getWebDriverWait().until(ExpectedConditions.visibilityOf(clickContinue()));
		clickContinue().click();
		Thread.sleep(5000);
		for (int i = 1; i <= 3; i++) {
			accpetButtonAllow().click();
		}
		Thread.sleep(3000);
		getWebDriverWait().until(ExpectedConditions.visibilityOf(clickOnBuy()));
		clickOnBuy().click();
		clickOnSearch().click();
		Thread.sleep(3000);
		clickOnSearchDropdown().click();
		Thread.sleep(3000);
		selectDropdownValues(city);
		// searchLocalities().sendKeys(searchArea);
		clickIncludesBox().click();
		Assert.assertTrue(numberOgBedrooms().getText().trim().equals("Number of Bedrooms".trim()));
		selectPrefrencetype(prefrence);
		
	}

}
