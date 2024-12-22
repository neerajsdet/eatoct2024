package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import setup.BrowserFactory;
import utils.Wrapper;

public class OrderTest {

    WebDriver driver=null;
    BasePage basePage;
    LoginPage loginPage;

    @BeforeClass(alwaysRun = true)
    public void tearUp(){
        driver = BrowserFactory.getBrowser(Wrapper.get("browser"));
        basePage = new BasePage(driver);
        loginPage = new LoginPage(driver);
        basePage.launchApplication(Wrapper.get("url"));
        Assert.assertTrue(loginPage.checkIfLoginPageDisplayed());
    }

    @Test(priority = 1)
    public void loginIntoApplication(){
        loginPage.setUserNameTextBox(Wrapper.get("username"));
        loginPage.setPasswordTextBox(Wrapper.get("password"));
        loginPage.clickOnLoginButton();
    }

    @Test(priority = 2)
    public void TestCase2(){
        System.out.println("Test2");
    }

    @Test(priority = 3)
    public void TestCase3(){
        System.out.println("Test3");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
