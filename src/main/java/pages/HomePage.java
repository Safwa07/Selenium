package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(className = "Register")
    WebElement register;

    By admin = By.xpath("//a[.//span[text()='Admin']]");
    By login = By.className("ico-login");
    By logout = By.xpath("//a[contains(text(), 'Logout')]");
//    By logout = By.className("ico-logout");

    public void openRegisterForm() {
        register.click();

    }
    public void chooseAdmin() {
        System.out.println("admin");
        driver.findElement(admin).click();
    }
    public void openLoginForm() {
        driver.findElement(login).click();
    }
    public void Logout() {
        driver.findElement(logout).click();
    }
}
