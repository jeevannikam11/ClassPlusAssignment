package com.classplus.googleMeetTest.stepDef;

import com.classplus.googleMeetTest.config.BaseConfig;
import com.classplus.googleMeetTest.stepDefHelper.GoogleMeetStepDefHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;
import pages.GoogleLogInPage;
import pages.HomePage;
import util.TestInitializer;

import java.awt.*;
import java.awt.event.KeyEvent;

@CucumberContextConfiguration
@ContextConfiguration(loader = SpringBootContextLoader.class, classes = {BaseConfig.class})
public class GoogleMeetStepDef extends TestInitializer{

    private String url = "https://meet.google.com/";
    HomePage homePage = new HomePage(driver);
    GoogleLogInPage googleLogInPage = new GoogleLogInPage(driver);


    @Before
    public void beforeTest(){
        System.out.println("Test started....");
    }

    @After
    public void afterTest(){
        System.out.println("Completed....");
    }

    @Given("Open google meet app on browser {string}")
    public void openGoogleMeetAppOnBrowser(String browserName) throws InterruptedException {
        if(browserName.equals("chrome")){
            setupChrome(url);
        }
    }

    @And("Click on start meeting button")
    public void clickOnStartMeetingButton() {
        homePage.clickOnStartMeetingButton();
    }

    @And("Enter user email {string} and password {string}")
    public void enterUserEmailAndPassword(String userName, String password) {
        googleLogInPage.enterUserName(userName);
        googleLogInPage.clickOnNextButton();
        googleLogInPage.enterUserPassword(password);
        googleLogInPage.clickOnNextButton();    }

    @And("Click on mute microphone button")
    public void clickOnMuteMicrophoneButton() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_CONTROL);    }

}
