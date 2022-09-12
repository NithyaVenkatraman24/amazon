package com.utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMethods {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\browser 92");
		driver = new ChromeDriver();
		return driver;
	}

	public static boolean elementFound(WebElement element) {
		boolean res = false;
		try {
			res = element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public static void setText(WebElement element, String name) {
		if (name != null && elementFound(element)) {
			element.clear();
			element.sendKeys(name);
		}
	}

	public static void setByJs(WebElement element, String name) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		if (name != null && elementFound(element)) {
			element.clear();
			executor.executeScript("arguments[0].getAttribute('value')", element);
		}
	}

	public static String getAttribute(WebElement element) {
		String name = null;
		if (elementFound(element)) {
			name = element.getAttribute("value");
		}
		return name;
	}

	public static String getText(WebElement element) {
		String name = null;
		if (elementFound(element)) {
			name = element.getText();
		}
		return name;
	}

	public static void click(WebElement element) {
		if (elementFound(element)) {
			element.click();
		}
	}

	public static void clickbyJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		if (elementFound(element)) {
			executor.executeScript("arguments[0].click();", element);
		}
	}

	public static void getScreenShot(String screenShotFileName) {
		File screenShotLocation = new File("./screenshot/" + screenShotFileName + ".png");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, screenShotLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
