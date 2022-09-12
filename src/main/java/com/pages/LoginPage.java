package com.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.driverfactory.DriverFactory;
import com.utility.BaseMethods;

public class LoginPage extends BaseMethods {

	public LoginPage() {
		PageFactory.initElements(DriverFactory.getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id='sitemap-entity-Account']")
	private WebElement clientbutton;
	

	public WebElement getClientbutton() {
		return clientbutton;
	}
	
	@FindBy(xpath = "//*[@title='New']")
	private WebElement newrecord;

	public WebElement getNewrecord() {
		return newrecord;
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
	@FindBy(xpath = "//*[@id=\"id-8448b78f-8f42-454e-8e2a-f8196b0419af-6-pre_clientsi"
			+ "ze3ef39988-22bb-4f0b-bbbe-64b5a3748aee-pre_clientsize.fieldControl-opt"
			+ "ion-set-select_c2e2d280-26f2-48ed-9b7e-31843a2f3cc3912660009\"]")
	private WebElement selectvalueclientsize;
	
	public WebElement getSelectvalueclientsize() {
		return selectvalueclientsize;
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
	@FindBy(xpath = "//*[@aria-label='Levy Paying']")
	private WebElement levyPaying;

	public WebElement getLevyPaying() {
		return levyPaying;
	}
	@FindBy(xpath = "//*[@aria-label='The Apprenticeship Service Status']")
	private WebElement theApprenticeshipServiceStatus;

	public WebElement getTheApprenticeshipServiceStatus() {
		return theApprenticeshipServiceStatus;
	}
	@FindBy(xpath = "//*[@aria-label='TAS Name']")
	private WebElement tasName;

	public WebElement getTasName() {
		return tasName;
	}
	@FindBy(xpath = "//*[@aria-label='TAS Agreement ID']")
	private WebElement tasAgreementId;


	public WebElement getTasAgreementId() {
		return tasAgreementId;
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
	@FindBy(xpath = "//*[@aria-label='Street 1']")
	private WebElement street1;

	public WebElement getStreet1() {
		return street1;
	}

	@FindBy(xpath = "//*[@data-id='defaultpricelevelid.fieldControl-LookupResultsDropdown_defaultpricelevelid_SelectedRecordList']")
	private WebElement priceList;

	public WebElement getPriceList() {
		return priceList;
	}
	@FindBy(xpath = "//*[@title='Client Details']")
	private WebElement clientDetails;


	public WebElement getClientDetails() {
		return clientDetails;
	}
	@FindBy(xpath = "//*[@title='Site Details']")
	private WebElement siteDetails;


	public WebElement getSiteDetails() {
		return siteDetails;
	}
	@FindBy(xpath = "//*[@title='Client Contact Details']")
	private WebElement clientContactDetails;


	public WebElement getClientContactDetails() {
		return clientContactDetails;
	}
	@FindBy(xpath = "//*[@title='Other']")
	private WebElement Others;


	public WebElement getOthers() {
		return Others;
	}
	
	@FindBy(xpath = "aria-label=\"Site Size\"")
	private WebElement siteSize;


	public WebElement getSiteSize() {
		return siteSize;
	}
	
	@FindBy(xpath = "//*[@aria-label='Street 2']")
	private WebElement Street2;


	public WebElement getStreet2() {
		return Street2;
	}
	@FindBy(xpath = "//*[@aria-label='Street 3']")
	private WebElement Street3;


	public WebElement getStreet3() {
		return Street3;
	}
	@FindBy(xpath = "//*[@aria-label='City']")
	private WebElement city;


	public WebElement getCity() {
		return city;
	}
	@FindBy (xpath = "//*[@aria-label='Postal Code']")
	private WebElement postalCode;


	public WebElement getPostalCode() {
		return postalCode;
	}
	@FindBy (xpath = "//*[@aria-label='Save (CTRL+S)']")
			private WebElement save;


	public WebElement getSave() {
		return save;
	}
	
	
}
