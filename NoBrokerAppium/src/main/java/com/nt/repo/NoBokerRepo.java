package com.nt.repo;
import java.util.List;

import org.openqa.selenium.By;

import com.nt.base.UIBase;

import io.appium.java_client.MobileElement;

public class NoBokerRepo extends UIBase {

	public MobileElement clickContinue() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/yesPhoneState"));
	}

	public MobileElement accpetButtonAllow() {
		return getAppiumDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		//return getAppiumDriver().findElement(By.xpath("//*[@text='Allow']"));
	}
	public MobileElement clickOnBuy() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/buyLayout"));
	}
	public MobileElement clickOnSearch() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/searchEditHome"));
	}
	public MobileElement clickOnSearchDropdown() {
		return getAppiumDriver().findElement(By.id("android:id/text1"));
	}
	public List<MobileElement> dropDownCity() {
		return getAppiumDriver().findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView"));
	}
	public MobileElement searchLocalities() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/localityAutoCompleteTxt"));
	}
	public MobileElement clickIncludesBox() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/nearByRadio"));
	}
	public MobileElement numberOgBedrooms() {
		return getAppiumDriver().findElement(By.id("com.nobroker.app:id/nb_search_label_bhk_type"));
	}
	public List<MobileElement> selectPrefrence(int num1) {
		return getAppiumDriver().findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout["+num1+"]/android.widget.CheckBox"));
	}
	public List<MobileElement> searchProperty(){
		return getAppiumDriver().findElements(By.id("com.nobroker.app:id/searchProperty"));
	}
   
}
