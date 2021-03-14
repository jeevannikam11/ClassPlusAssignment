package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.ObjectRepository;

public class GoogleLogInPage extends ObjectRepository {

    private static final Logger LOGGER = LogManager.getLogger(GoogleLogInPage.class);


    public GoogleLogInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = LoginScreen.email_Xpath)
    public WebElement email;

    @FindBy(how = How.XPATH, using = LoginScreen.password_Xpath)
    public WebElement password;

    @FindBy(how = How.XPATH, using = LoginScreen.next_button_Xpath)
    public WebElement nextButton;

    public void enterUserName(String userName) {
        try{
            email.sendKeys(userName);
            LOGGER.info("Username entered.....");
        }catch (Exception e){
            LOGGER.error("Exception while entering username");
            e.printStackTrace();
        }

    }

    public void enterUserPassword(String userPassword) {
        try {
            password.sendKeys(userPassword);
            LOGGER.info("Password entered.....");
        }catch (Exception e){
            LOGGER.error("Exception while entering password");
            e.printStackTrace();
        }
    }

    public void clickOnNextButton() {
        try {
            nextButton.click();
            LOGGER.info("Clicked on next button.......");
        }catch (Exception e){
            LOGGER.error("Exception while clicking on next button");
            e.printStackTrace();
        }
    }
}
