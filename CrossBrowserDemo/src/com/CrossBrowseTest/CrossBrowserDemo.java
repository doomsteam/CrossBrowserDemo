package com.CrossBrowseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo {
	WebDriver driver;

	@Parameters("browser")
	@Test
	public void launchApp(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Mahnaj\\eclipse-workspace\\CrossBrowserDemo\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Mahnaj\\eclipse-workspace\\CrossBrowserDemo\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Mahnaj\\eclipse-workspace\\CrossBrowserDemo\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Mahnaj\\eclipse-workspace\\CrossBrowserDemo\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/");
		Thread.sleep(2000);
		driver.close();

	}

}