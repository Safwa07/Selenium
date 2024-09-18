package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends PageBase {
    By searchByUsername = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
//    By searchByUsername = By.xpath("//div[@class='oxd-input-group']//input[@control-id='ControlID-1']");
    By searchBtn = By.xpath("//button[@type='submit']");


    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public void search(String username) {
        driver.findElement(searchByUsername).isDisplayed();
        driver.findElement(searchByUsername).sendKeys(username);
        clickButton(searchBtn);
//        driver.findElement(searchBtn).click();

    }
}
