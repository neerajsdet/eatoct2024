package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//h5[normalize-space()='Login']")
    WebElement loginTextOnLoginPage;
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement userNameTextBox;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordTextBox;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
    WebElement userLoginIcon;

    public boolean checkIfLoginPageDisplayed(){
        return loginTextOnLoginPage.isDisplayed();
    }

    public void setUserNameTextBox(String userName) {
        userNameTextBox.clear();
        userNameTextBox.sendKeys(userName);
    }

    public void setPasswordTextBox(String password) {
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

}
