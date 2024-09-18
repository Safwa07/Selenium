package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public WebDriver getDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return new ChromeDriver(options);
    }


    @BeforeSuite
    public void startDriver() {
        System.out.println("Open Chrome Driver");
        driver = getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        System.out.println("Open URL");
//        driver.navigate().to("https://demo.opencart.com/en-gb?route=account/register");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2Flogin");
        System.out.println("Opened URL");

    }

    @AfterSuite
    public void stopDriver() {
        driver.quit();
    }

    @AfterMethod
    public void screenshotOnFailure(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed");
            System.out.println("Taking Screenshot");
            Helper.captureScreenshot(driver, result.getName());

        }
    }
}
