package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.ObjectRepository;

public class HomePage extends ObjectRepository {

    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = LandingScreen.start_meeting_Xpath)
    public WebElement startMeeting;


    public void clickOnStartMeetingButton(){
        try{
            startMeeting.click();
            LOGGER.info("Clicked on start meeting button.......");
        }catch (Exception e){
            LOGGER.error("Exception occured while clicking start meeting button");
            e.printStackTrace();
        }
    }

}
