package com.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.driverfactory.DriverFactory;
import com.utility.BaseMethods;

public class OthersPage extends BaseMethods {

	public OthersPage() {
		PageFactory.initElements(DriverFactory.getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@data-id='defaultpricelevelid.fieldControl-LookupResultsDropdown_defaultpricelevelid_SelectedRecordList']")
	private WebElement priceList;

	public WebElement getPriceList() {
		return priceList;
	}
	
}