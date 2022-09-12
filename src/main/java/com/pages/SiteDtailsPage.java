package com.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.driverfactory.DriverFactory;
import com.utility.BaseMethods;

public class SiteDtailsPage extends BaseMethods {

	public SiteDtailsPage() {
		PageFactory.initElements(DriverFactory.getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@aria-label='Employer ID (ERN)']")
	private WebElement employerId;

	public WebElement getEmployerId() {
		return employerId;
	}
	@FindBy(xpath = "//*[@aria-label='Status Reason']")
	private WebElement statusReason;

	public WebElement getStatusReason() {
		return statusReason;
	}
	
	}
