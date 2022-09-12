
package com.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.driverfactory.DriverFactory;
import com.utility.BaseMethods;

public class AccountSummaryPage extends BaseMethods {

	public AccountSummaryPage() {
		PageFactory.initElements(DriverFactory.getdriver(), this);
	}

	@FindBy(xpath = "//*[@aria-label='Client Name']")
	private WebElement clientName;

	public WebElement getClientName() {
		return clientName;

	}
	
	@FindBy(xpath = "//*[@aria-label='Client Profile, Lookup']")
	private WebElement clientProfile;

	public WebElement getClientProfile() {
		return clientProfile;
	}
	
	@FindBy(xpath = "//*[@aria-label='Parent Account, Lookup']")
	private WebElement parentAccount;

	public WebElement getParentAccount() {
		return parentAccount;
	}
	
	@FindBy(xpath = "//*[@aria-label='Client Category']")
	private WebElement clientCategory;

	public WebElement getClientCategory() {
		return clientCategory;
	}
	@FindBy(xpath = "//*[@aria-label='Client Size']")
	private WebElement clientSize;

	public WebElement getClientSize() {
		return clientSize;
	}
	
	@FindBy(xpath = "//*[@aria-label='Client Ownership']")
	private WebElement clientOwnership;

	public WebElement getClientOwnership() {
		return clientOwnership;
	}
	
	@FindBy(xpath = "//*[@aria-label='Client Type, Lookup']")
	private WebElement clientType;

	public WebElement getClientType() {
		return clientType;
	}
	
	@FindBy(xpath = "//*[@aria-label='TA or Contract?']")
	private WebElement TAContract;

	public WebElement getTAContract() {
		return TAContract;
	}

	@FindBy(xpath = "//*[@aria-label='Sector, Lookup']")
	private WebElement sector;

	public WebElement getSector() {
		return sector;
		
	}
	@FindBy(xpath = "//*[@aria-label='Office Type']")
	private WebElement officeType;

	public WebElement getOfficeType() {
		return officeType;
	}
	
	@FindBy(xpath = "//*[@aria-label='Head Office, Lookup']")
	private WebElement headOffice;

	public WebElement getHeadOffice() {
		return headOffice;
	}
	
	
}

