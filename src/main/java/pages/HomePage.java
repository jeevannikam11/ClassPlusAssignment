package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.TestInitializer;

public class HomePage extends TestInitializer {

    static WebDriver driver;

    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = LandingScreen.start_meeting_Xpath)
    public WebElement startMeeting;


    public void clickOnStartMeetingButton(){
        startMeeting.click();
    }

}
