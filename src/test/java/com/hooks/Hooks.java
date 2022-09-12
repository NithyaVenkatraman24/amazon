package com.hooks;


import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.driverfactory.DriverFactory;
import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static ExtentReports extent;
	private DriverFactory driverfactory;

	@Before
	public void launchBrowser() {
		driverfactory = new DriverFactory();
		driverfactory.init_driver("chrome");
	}
	@BeforeStep
	public void addScreenshotBeforeStep(Scenario scenario) throws IOException {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		final byte[] screenshot = ((TakesScreenshot) DriverFactory.getdriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");

	}
	@AfterStep
	public void addScreenshotAfterStep(Scenario scenario) throws IOException {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		final byte[] screenshot = ((TakesScreenshot) DriverFactory.getdriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");

	}

	@After
	public void closeBrowser() {
		driverfactory.getdriver().quit();
	}

}
