package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ResgisterPage;
import util.TestBase;

public class UserRegisterationTest extends TestBase {

    HomePage home;
    ResgisterPage userResgister;
    LoginPage userLogin;
    AdminPage userAdmin;

    String username = "Admain";
    String firstName = "safwa";
    String lastName = "nassar";
    String email = "nassar9@gmail.com";
    String password = "admin123";


    @Test(priority = 1)
    public void userCanRegister() throws InterruptedException {
        System.out.println("userCanRegister");
        userResgister = new ResgisterPage(driver);
        userResgister.userResgister(username, password);
    }
    @Test(priority = 3, dependsOnMethods = "userCanRegister")
    public void userCanLogout() throws InterruptedException {
        System.out.println("userCanLogout");
        driver.findElement(By.className("oxd-userdropdown-tab")).click();
        System.out.println("2nd userCanLogout");
        home = new HomePage(driver);
        home.Logout();
    }
    @Test(priority = 2)
    public void userCanSearch() throws InterruptedException {
        System.out.println("userCanSearch");
        home = new HomePage(driver);
        home.chooseAdmin();
        System.out.println("3rd userCanSearch");
        userAdmin = new AdminPage(driver);

        userAdmin.search("safwa");
        System.out.println("4th userCanSearch");
        Thread.sleep(2000);
    }

}
