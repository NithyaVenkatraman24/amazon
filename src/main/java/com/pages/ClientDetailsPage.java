package com.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.driverfactory.DriverFactory;
import com.utility.BaseMethods;

public class ClientDetailsPage extends BaseMethods {
	public ClientDetailsPage() {
		PageFactory.initElements(DriverFactory.getdriver(), this);
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
	
}