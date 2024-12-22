package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    WebDriver driver;
    public AdminPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
