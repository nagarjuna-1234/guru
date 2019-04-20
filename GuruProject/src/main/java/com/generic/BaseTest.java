	package com.generic;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public abstract class BaseTest implements AutoConstant {

	public WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;

	@BeforeSuite
	public void beforesuite() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/SMEExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("HostName", "SoftwareTestingMateral");
		extent.setSystemInfo("Environment", "Automation Testing");
		extent.setSystemInfo("User Name", "Naga");

		htmlReporter.config().setDocumentTitle("Title of the reportcomes here");
		htmlReporter.config().setReportName("name of the reportcomes here");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
	}

	@BeforeMethod
	public void precondition() {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	}

	@AfterMethod
	public void postcondition(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			Utilities.captureScreenShot(driver, result.getName());
			logger.fail(result.getThrowable());
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test case fail", ExtentColor.RED));

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Test case passed", ExtentColor.GREEN));
		}
		driver.close();
	}

	@AfterSuite
	public void aftersuite() {
		extent.flush();
	}
}
