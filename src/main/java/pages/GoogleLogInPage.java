package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.TestInitializer;

public class GoogleLogInPage extends TestInitializer {

    static WebDriver driver;

    public GoogleLogInPage(WebDriver driver) {
        GoogleLogInPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = LoginScreen.email_Xpath)
    public WebElement email;

    @FindBy(how = How.XPATH, using = LoginScreen.password_Xpath)
    public WebElement password;

    @FindBy(how = How.XPATH, using = LoginScreen.next_button_Xpath)
    public WebElement nextButton;

    public void enterUserName(String userName){
        email.sendKeys(userName);
    }

    public void enterUserPassword(String password){
        email.sendKeys(password);
    }

    public void clickOnNextButton(){
        nextButton.click();
    }
}
