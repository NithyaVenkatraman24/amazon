package com.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.driverfactory.DriverFactory;
import com.utility.BaseMethods;

public class HomePage extends BaseMethods {

	public HomePage() {
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
}