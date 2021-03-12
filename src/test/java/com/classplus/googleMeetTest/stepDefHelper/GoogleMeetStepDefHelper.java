package com.classplus.googleMeetTest.stepDefHelper;

import pages.GoogleLogInPage;
import pages.HomePage;
import util.TestInitializer;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GoogleMeetStepDefHelper extends TestInitializer {

    HomePage homePage = new HomePage(driver);
    GoogleLogInPage googleLogInPage = new GoogleLogInPage(driver);


    public void startMeeting(){
        homePage.clickOnStartMeetingButton();
    }

    public void enterUserDetails(String userName, String password){
        googleLogInPage.enterUserName(userName);
        googleLogInPage.clickOnNextButton();
        googleLogInPage.enterUserPassword(password);
        googleLogInPage.clickOnNextButton();
    }

    public void clickOnMuteButton() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }


}
