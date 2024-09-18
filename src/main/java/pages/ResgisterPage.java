package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResgisterPage extends PageBase {

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.className("orangehrm-login-button");

    public ResgisterPage(WebDriver driver) {
        super(driver);
    }

    public void userResgister(String username, String password) throws InterruptedException {
        System.out.println("userResgisterFunction");

        driver.findElement(this.username).sendKeys(username);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(loginBtn).click();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Adjust the timeout as needed
////        wait.until(ExpectedConditions.elementToBeClickable(policyToggel));
//
////        driver.findElement(policyToggel).click();
//        System.out.println("clicked");
//
////        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
//        driver.findElement(registerButton).click();
//        System.out.println("clicked");
//
//        Thread.sleep(2000);
    }
//    public String registeredSuccessfully(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Adjust the timeout as needed
//        By registeredSuccessfullyTxt = By.tagName("h1");
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(registeredSuccessfullyTxt)));
//        return driver.findElement(registeredSuccessfullyTxt).getText();
//    }
}
