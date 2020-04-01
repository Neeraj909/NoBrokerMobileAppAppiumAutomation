package com.nt.repo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nt.base.UIBase;


public class NoBokerRepo extends UIBase {

	public WebElement clickContinue() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/yesPhoneState"));
	}

	public WebElement accpetButtonAllow() {
		return getAppiumDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		//return getAppiumDriver().findElement(By.xpath("//*[@text='Allow']"));
	}
	public WebElement clickOnBuy() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/buyLayout"));
	}
	public WebElement clickOnSearch() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/searchEditHome"));
	}
	public WebElement clickOnSearchDropdown() {
		return getAppiumDriver().findElement(By.id("android:id/text1"));
	}
	public List<WebElement> dropDownCity() {
		return getAppiumDriver().findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView"));
	}
	public WebElement searchLocalities() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/localityAutoCompleteTxt"));
	}
	public WebElement clickIncludesBox() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/nearByRadio"));
	}
	public WebElement numberOgBedrooms() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/nb_search_label_bhk_type"));
	}
	public List<WebElement> selectPrefrence(int num1) {
		return getAppiumDriver().findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout["+num1+"]/android.widget.CheckBox"));
	}
	public List<WebElement> searchProperty(){
		return getAppiumDriver().findElements(By.id("com.nobroker.app:id/searchProperty"));
	}
   
}
