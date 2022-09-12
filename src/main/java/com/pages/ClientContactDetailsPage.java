package com.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.driverfactory.DriverFactory;
import com.utility.BaseMethods;

public class ClientContactDetailsPage extends BaseMethods {

	public ClientContactDetailsPage() {
		PageFactory.initElements(DriverFactory.getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@aria-label='Street 1']")
	private WebElement street1;

	public WebElement getStreet1() {
		return street1;
	}

	}
